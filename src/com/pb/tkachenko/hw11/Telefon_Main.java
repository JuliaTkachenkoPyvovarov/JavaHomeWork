package com.pb.tkachenko.hw11;

import java.util.ArrayList;
import java.util.Scanner;

public class Telefon_Main {

    public static void main(String args[]) {
        FIO fio = new FIO("Иванов Иван Иванович");
        BDate bDate = new BDate("11.03.2003");
        Adres adres = new Adres("Днепр");
        Tel tel = new Tel();
        ChangeDate changeDate = new ChangeDate();

        //private static void contact() {
            Contact contact1 = new Contact();

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите ФИО:");
            String fio = scan.next();
            System.out.println("Введите дату рождения:  ");
            String bDate = in.next();
            System.out.println("Введите адрес: ");
            String adres = in.next();
            System.out.println("Введите номер телефона: ");
            String tel = in.next();

        }
    
}

//Обеспечить следующий функционал:




//редактирование элемента
