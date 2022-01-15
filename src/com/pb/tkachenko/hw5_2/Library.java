package com.pb.tkachenko.hw5_2;

import com.pb.tkachenko.hw5.Book;
import com.pb.tkachenko.hw5.Reader;

public class Library {
    public static void main (String[] args){
        com.pb.tkachenko.hw5.Book book1 = new com.pb.tkachenko.hw5.Book("Приключения", "Иванов И.И.", "2000 г." );
        com.pb.tkachenko.hw5.Book book2 = new com.pb.tkachenko.hw5.Book("Словарь", "Сидоров А.В.", "1988" );
        com.pb.tkachenko.hw5.Book book3 = new Book("Энциклопедия", "Гусев К.В.", "2020");

        com.pb.tkachenko.hw5.Reader reader1 = new com.pb.tkachenko.hw5.Reader("Читатель1", "1",  "Психологический","11.03.1981", "0677896543");
        com.pb.tkachenko.hw5.Reader reader2 = new Reader("Читатель2", "2", "Филологический", "20.02.1985", "0982994165");
        //int count = 3;

        reader1.returnBook(book1);
        reader1.returnBook(book1.name, book2.name, book3.name);
        reader1.returnBook(5);

        reader2.takeBook(book1);
        reader2.takeBook(book1.name, book2.name);
        reader2.takeBook(2);

    }
    };
//создать массив Reader[] readerArray = new Reader[3];
//получить свойства и методы:
//bookArray[1].getTitle()
//readerArray[3].takeBook(3);