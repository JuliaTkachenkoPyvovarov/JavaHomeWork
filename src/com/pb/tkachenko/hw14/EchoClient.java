package com.pb.tkachenko.hw14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {


    public static void main(String[] args) throws Exception {
        System.out.println("Клиент стартовал");

        // Определяем номер порта, на котором нас ожидает сервер для ответа и ИП
        String serverIp = "127.0.0.1";
        int serverPort = 49085;

        System.out.println("Соединяемся с сервером " + serverIp + ":" + serverPort);

        // Открыть сокет (Socket) для обращения к локальному компьютеру - это специальный класс для сетевого взаимодействия c клиентской стороны
        // Сервер мы будем запускать на этом же компьютере
        Socket socket = new Socket(serverIp, serverPort);

        System.out.println("Соединение установлено.");

        BufferedReader inSer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter outSer = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader inConsole = new BufferedReader(new InputStreamReader(System.in));

        String dataFromUser, dataFromServer;

        // Основной цикл отправки сообщений серверу
        System.out.println("Введите текст сообщения: ");
        while ((dataFromUser = inConsole.readLine()) != null) {
            outSer.println(dataFromUser);
            dataFromServer = inSer.readLine();
            System.out.println(dataFromServer);
            if ("Выход.".equalsIgnoreCase(dataFromUser)) {
                break;
            }
        }

        String str;
        // Входим в цикл чтения, что нам ответил сервер
        while ((str = inSer.readLine()) != null) {
            // Если пришел ответ “bye”, то заканчиваем цикл
            if (str.equals("Выход.")) {
                break;
            }
            // Печатаем ответ от сервера на консоль для проверки
            System.out.println(str);
            // Посылаем ему "bye" для окончания "разговора"
            outSer.println("Выход.");
        }

        outSer.close();
        inSer.close();
        outSer.close();
        socket.close();
    }

}
