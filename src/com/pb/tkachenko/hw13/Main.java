package com.pb.tkachenko.hw13;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        //Создаем массив из 5-ти елементов и выводим на экран
        List<Integer> buffers = Arrays.asList(0, 0, 0, 0, 0);
        System.out.println("Пустой буффер: " + buffers);

        //Создаем процессы потребителя и производителя
        Thread run1 = new Thread(new Consumer(buffers, 500, Numbers.Five));
        Thread run2 = new Thread(new Producer(buffers, 500, Numbers.Three));

        //поехали
        run1.start();
        run2.start();
    }
}