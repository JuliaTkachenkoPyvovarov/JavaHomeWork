package com.pb.tkachenko.hw5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Book {
    public String year;
    public String name;
    public String autor;
    public String yeare;
    public int count;

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


}

//Класс Book хранит такую информацию о книге: название, автор книги, год издания
