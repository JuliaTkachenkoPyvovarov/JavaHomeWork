package com.pb.tkachenko.hw5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Book {
    String name;
    String autor;
    String year;
    int count;

    public Book(String name, String autor, String year) {
        this.name = name;
        this.autor = autor;
        this.year = year;
    }

    public Book(String name) {
        this.name = name;
        this.autor = autor;
        this.year = year;
    }

    public Book() {

    }

    //- takeBook, который будет принимать количество взятых книг.Выводит на консоль сообщение "Петров В. В. взял 3 книги".
    public void takeBook(String fio, int count) {
        String a = fio + "взял " + count + " книги. ";
        System.out.println(a);
    }

    //takeBook, который будет принимать переменное количество названий книг.
//Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
    public void takeBook(String... names) {
        //System.out.println(names[0]);
        System.out.print("Петров В.В. взял книги: ");
        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println(" ");
    }

    public void takeBook(Array... alls) {
        System.out.println("Петров В.В. взял книги: ");
        for (Array all : alls) {
            System.out.print(all + ", ");
        }
        System.out.println(" ");
    }

    public void returnBook(String fio, int count) {
        String b = "Петров В.В. вернул " + count + " книги. ";
        System.out.println(b);
    }

    public void returnBook(String... names) {
        System.out.print("Петров В.В. вернул книги: ");
        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println(" ");
    }

    public void returnBook(Array... alls) {
        System.out.println("Петров В.В. вернул книги: ");
        for (Array all : alls) {
            System.out.print(all + ", ");
        }
        System.out.println(" ");
    }
}

//Класс Book хранит такую информацию о книге: название, автор книги, год издания
