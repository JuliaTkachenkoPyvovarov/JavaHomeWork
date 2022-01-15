package com.pb.tkachenko.hw5_2;

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

    public Book(String name, String autor) {
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
};

//Класс Book хранит такую информацию о книге: название, автор книги, год издания

