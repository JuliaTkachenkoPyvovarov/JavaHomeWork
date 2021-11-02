package com.pb.tkachenko.hw5;

import java.util.Scanner;

public class Library {
    public static void main (String[] args){
        Book book1 = new Book("Приключения", "Иванов И.И.", "2000 г." );
        Book book2 = new Book();
        Book book3 = new Book();
        book1.name = "Приключения";
        book2.name = "Словарь";
        book3.name = "Энциклопедия";
        book1.autor = "Иванов И.И.";
        book2.autor = "Сидоров А.В.";
        book3.autor = "Гусев К.В.";
        book1.year = "2000 г.";
        book2.year = "1980 г.";
        book3.year = "2010 г.";
        //int count = 3;

        String setFio = "Петров В.В.";

        book1.takeBook(setFio,3);
        book2.takeBook(book1.name, book2.name, book3.name);
        book3.takeBook(book1.name+" ("+book1.autor + book1.year + ") ", book2.name + " ("+book2.autor + book2.year + ") ", book3.autor + " ("+book3.autor + book3.year + ") ");

        book1.returnBook(setFio, 3);
        book2.returnBook(book1.name, book2.name, book3.name);
        book3.returnBook(book1.name+" ("+book1.autor + book1.year + ") ", book2.name + " ("+book2.autor + book2.year + ") ", book3.autor + " ("+book3.autor + book3.year + ") ");

    }

}
