package com.pb.tkachenko.hw13;

import java.util.List;
import java.util.Random;

public class Consumer implements Runnable {  //Потребитель


    private final List<Integer> buffer; //массив буфер
    private long timeSleep = 3000;      //перерыв 3 сек
    private String number;               //номер потока

    public Consumer(List<Integer> buffer, long Pause, String number) { //конструктор
        this.buffer = buffer;
        this.timeSleep = Pause;
        this.number = number;
    }

    //описание работы потока
    public void go() {
        String threadName = Thread.currentThread().getName();
        synchronized (buffer) { //синхронизируемся по работе с буфером
            try {
                int qty = 0;
                while (qty <= 10) { //кол-во циклов "жизни" потока
                    int seconds = new Random().nextInt(10);

                    int prov = -1; //переменная для проверки есть ли значения или буфер пустой
                    for (int i = 0; i < buffer.size(); i++) {
                        if (buffer.get(i) != 0) {
                            //если значение есть выводим сообщение со значением и буфер
                            System.out.println(number + threadName + " считал значение: " + Numbers.Three + buffer.get(i));
                            buffer.set(i, 0);
                            prov = 1;
                            System.out.println(Numbers.Seven + buffer);
                            break;
                        }
                    }
                    //если параметр не менялся - значений нет - буфер пустой, ждем поток Писателя (производителя)
                    if (prov == -1) {
                        System.out.println(number + "Буфер пустой, Читатель " + Numbers.Six + "ждет 5 сек.");
                        buffer.notify();
                        buffer.wait(4000);
                    } else {
                        Thread.sleep(seconds * timeSleep);
                        buffer.wait(timeSleep);
                    }
                    qty++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                //Итог работі потребителя
                System.out.println(number + threadName + Numbers.Two + " процесс окончен.");
            }
        }
    }

    @Override
    public void run() {
    }
}
