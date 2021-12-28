package com.pb.tkachenko.hw13;

import java.util.List;
import java.util.Random;

public class Producer implements Runnable {

            private final List<Integer> buffer; //массив буфер
            private long timeSleep = 3000;      //перерыв 3 сек
            private String number ;               //номер потока


            public Producer(List<Integer> buffer, long Pause, String number) { //конструктор
                this.buffer = buffer;
                this.timeSleep = Pause;
                this.number = number;
            }

            public void run() { //запуск
                String threadName = Thread.currentThread().getName();
                synchronized (buffer) {  //синхронизация по работе с буфером
                    try {
                        int qty = 0;
                        while (qty <= 10) { //кол-во итераций по формированию данных или ожиданию
                            int seconds = new Random().nextInt(10);

                            int prov = -1; //параметр для проверки есть ли место в буфере
                            for (int i = 0; i < buffer.size(); i++) {
                                if (buffer.get(i) == 0) {
                                    buffer.set(i, (int) (Math.random() * 100)); //генерируем число
                                    prov = 1; //меняем признак что в буфере есть место и данные внесены
                                    //сообщение что внесли значение и вывод буфера
                                    System.out.println(number + threadName + " записал значение: " + Numbers.Eight + buffer.get(i));
                                    System.out.println(Numbers.Four + buffer);
                                    break;
                                }
                            }
                            //если параметр не менялся - буфер полон ждем поток для Читателя
                            if (prov == -1) {
                                System.out.println(number + "Буфер заполнен, Производитель " + Numbers.Six + "ждет 7 сек.");

                                buffer.notify();
                                buffer.wait(7000);
                            } else {
                                Thread.sleep(seconds * timeSleep);
                                buffer.wait(timeSleep);
                            }
                            qty++;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        //Итог
                        System.out.println(number + threadName + Numbers.Two + "Процесс окончен.");
                    }
                }
            }
        }
    }
