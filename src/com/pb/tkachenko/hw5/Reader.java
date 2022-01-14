package com.pb.tkachenko.hw5;

import java.util.Date;

public class Reader {
    private String fio;
    private String numer;
    private String facultet;
    private String birthDate;
    private String telefone;

    public Reader(String fio) {
        this.fio = fio;
    }

    public Reader(String fio, String numer) {
        this.fio = fio;
        this.numer = numer;
    }

    public Reader(String fio, String numer, String facultet) {
        this.fio = fio;
        this.numer = numer;
        this.facultet = facultet;
    }

    public Reader(String fio, String numer, String facultet, String birthDate) {
        this.fio = fio;
        this.numer = numer;
        this.facultet = facultet;
        this.birthDate = birthDate;
    }

    public Reader(String fio, String numer, String facultet, String birthDate, String telefone) {
        this.fio = fio;
        this.numer = numer;
        this.facultet = facultet;
        this.birthDate = birthDate;
        this.telefone = telefone;
    }

    public void takeBook(int bookCount) {
        System.out.println(fio + " взял " + bookCount + " книг.");
    }

    public void takeBook(String... bookNames) {
        System.out.println(fio + " взял книги: ");
        for (String name: bookNames) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(fio + " взял книги: ");
        for (Book book: books) {
            System.out.println(book.name + ", " + book.autor+ ", " + book.year +".");
        }
    }

    public void returnBook(int bookCount) {
        System.out.println(fio + " вернул " + bookCount + " книг.");
    }

    public void returnBook(String... bookNames) {
        System.out.println(fio + " вернул такие книги: ");
        for (String name: bookNames) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(fio + " вернул книги: ");
        for (Book book: books) {
            System.out.println(book.name + ", " + book.autor + ", " + book.year + ".)");
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", numer='" + numer + '\'' +
                ", facultet='" + facultet + '\'' +
                ", birthDate=" + birthDate +
                ", telefone='" + telefone + '\'' +
                '}';
    }
};

//Класс Reader хранит такую информацию о пользователе библиотеки:
//- ФИО
//- номер читательского билета
//- факультет
//- дата рождения
//- телефон
