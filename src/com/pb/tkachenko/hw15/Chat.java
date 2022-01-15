package com.pb.tkachenko.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Chat extends JFrame {
        static JTextArea area;
        JPanel p;
        JScrollPane scroll;
        JTextField content;
        static JButton send;

        PrintWriter writer;
        BufferedReader reader;

        JTextField output = new JTextField();
        String outputText = output.getText();

        public static void main(String[] args) throws IOException {
            Chat chat = new Chat();
            System.out.println("Чат стартовал");

            // Определяем номер порта, на котором нас ожидает сервер для ответа и ИП
            String serverIp = "127.0.0.1";
            int serverPort = 49085;

            Socket socket = new Socket(serverIp, serverPort);

            System.out.println("Соединение чат-сервер установлено.");

            BufferedReader inSer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter outSer = new PrintWriter(socket.getOutputStream(), true);

            String inputText, outputText;

            // Входим в цикл чтения, что нам ответил сервер
            inputText = inSer.readLine();
            Chat.area.append(inputText);
            while ((inputText = inSer.readLine()) != null) {
                // Если пришел ответ “Выход.”, то заканчиваем цикл
                if (inputText.equals("Выход.")) {
                    break;
                }
                // Посылаем ему "Выход." для окончания "разговора"
                outSer.println("Выход.");
            }

            outSer.close();
            inSer.close();
            outSer.close();
            socket.close();
        }


        Chat() throws IOException {
            area=new JTextArea();
            scroll=new JScrollPane(area);
            content=new JTextField(15);
            send = new JButton ("Отправить");
            p=new JPanel();

            p.add(content);
            p.add(send);
            p.add(area);

            //обработка кнопки "отправить"
            send.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //Для получения текста из JFrame поля использую метод .getText() и записываю этот текст в еременнуюString
                    writer.println(outputText);
                    writer.flush();
                    //output.setText("");
                }
            });

            this.add(scroll);
            this.add(p, BorderLayout.SOUTH);

            this.setTitle ("ПриватЧат");
            this.setSize(300,300);
            this.setLocation(300,300);
            this.setResizable(true); //можно изменять размеры окна, если false - нельзя изменить

            //закрываем чат
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //делаем чат видимым
            this.setVisible(true);

        }
    }
