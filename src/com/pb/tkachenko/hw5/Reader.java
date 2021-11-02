package com.pb.tkachenko.hw5;

import java.util.Date;

public class Reader {
    private String fio;
    private String numer;
    private String facultet;
    private Date birthDate;
    private String telefone;


    public Reader(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }
}

//Класс Reader хранит такую информацию о пользователе библиотеки:
//- ФИО
//- номер читательского билета
//- факультет
//- дата рождения
//- телефон