package com.pb.tkachenko.hw14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Класс - сервер, принимает запросы от клиентов и отдает данные
public class EchoServer {

    static class Handler implements Runnable {
        private final Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + ": Получен запрос от клиента");

                // Создать поток для чтения символов из сокета
                // Для этого надо открыть поток сокета - socket.getInputStream()
                // Потом преобразовать его в поток символов - new InputStreamReader
                // И уже потом сделать его читателем строк - BufferedReader
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                // Создать поток для записи символов в сокет
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                String clientMessage;

                // цикл ожидания сообщений от клиента
                System.out.println("Ожидаем сообщений");
                while ((clientMessage = in.readLine()) != null) {
                    //выводим в консоль сервера дату время и текст от клиента
                    out.write("Сервер: " + LocalDateTime.now().toString() + ", Текст: " + clientMessage);
                    //out.write(LocalDateTime.now().toString());
                    {
                        // Сравниваем с "Выход." и если это так - выходим из цикла
                        if ("Выход.".equalsIgnoreCase(clientMessage)) {
                            // Тоже говорим клиенту "Выход." и выходим из цикла
                            out.write("Выход.");
                            break;
                        }
                    }
                System.out.println("Закрываем соединение с клиентом");
                out.close();
                in.close();
            }

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (Exception ex) {
                }
                }
            }
        }

        public static void main(String[] args) throws Exception {

            // Определяем номер порта, который будет "слушать" сервер
            int port = 49085;

            // Открыть серверный сокет (ServerSocket) - это специальный класс для сетевого взаимодействия с серверной стороны
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Сервер запущен на порту : " + port);

            //Указываем пул потоков, т.е. возможное количество соединений
            ExecutorService threadPool = Executors.newFixedThreadPool(7);

            // Входим в бесконечный цикл и ждем запроса клиента
            while (true) {

                // Получив соединение начинаем работать с сокетом
                Socket clientSocket = serverSocket.accept();

                //запускаем каждый запрос в отдельном потоке
                threadPool.submit(new Handler(clientSocket));
            }
        }
    }
