package com.pb.tkachenko.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

public class Chat extends JFrame {
        JTextArea area;
        JPanel p;
        JScrollPane scroll;
        JTextField content;
        JButton send;
        PrintWriter writer;

        public static void main(String[] args) {
            Chat chat=new Chat();
        }

        Chat(){
            area=new JTextArea();
            scroll=new JScrollPane(area);
            content=new JTextField(15);
            send = new JButton ("Отправить");
            p=new JPanel();

            p.add(content);
            p.add(send);

            //обработка кнопки "отправить"
            send.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //Для получения текста из JFrame поля использую метод .getText() и записываю этот текст в еременнуюString
                    JTextField output = new JTextField();
                    String outputText = output.getText();
                    writer.println(outputText);
                    writer.flush();
                    output.setText("");
                }
            });

            this.add(scroll);
            this.add(p, BorderLayout.SOUTH);

            this.setTitle ("ПриватЧат");
            this.setSize(300,300);
            this.setLocation(300,300);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);

        }
    }
