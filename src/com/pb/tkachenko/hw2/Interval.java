package com.pb.tkachenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ttt;

        System.out.println("Введите число и нажмите ENTER");
        ttt = scan.nextInt();

        if (ttt >= 0 && ttt <= 14) {
            System.out.println("Число " + ttt + " принадлежит промежутку[0-14]");
        } else {
            if (ttt >= 15 && ttt <= 35) {
                System.out.println("Число " + ttt + " принадлежит промежутку [15-35]");
            } else {
                if (ttt >= 36 && ttt <= 50) {
                    System.out.println("Число " + ttt + " принадлежит промежутку[36-50]");
                } else {
                    if (ttt >= 51 && ttt <= 100) {
                        System.out.println("Число " + ttt + " принадлежит промежутку[51-100]");
                    } else System.out.println("Число " + ttt + " НЕ принадлежит промежутку [0-100]");
                }

            }

        }
    }
}
