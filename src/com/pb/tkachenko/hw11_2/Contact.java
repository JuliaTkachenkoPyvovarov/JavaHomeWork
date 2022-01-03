package com.pb.tkachenko.hw11_2;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Contact implements Serializable {
    private String FIO;
    private String bDate;
    private String adres;
    private ArrayList<String> tel = new ArrayList<>();
    private LocalDate ChangeDate;


    public Contact(String FIO) {
        this.FIO = FIO;
    }

    public Contact(String FIO, String bDate) {
        this.FIO = FIO;
        this.bDate = bDate;
    }

    public Contact(String FIO, String bDate, String adres) {
        this.FIO = FIO;
        this.bDate = bDate;
        this.adres = adres;
    }

    public Contact(String FIO, String bDate, String adres, ArrayList<String> tel) {
        this.FIO = FIO;
        this.bDate = bDate;
        this.adres = adres;
        this.tel = tel;
    }

    public Contact(String FIO, String bDate, String adres, ArrayList<String> tel, LocalDate changeDate) {
        this.FIO = FIO;
        this.bDate = bDate;
        this.adres = adres;
        this.tel = tel;
        ChangeDate = changeDate;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getbDate() {
        return bDate;
    }

    public static void setbDate(String bDate) {
        this.bDate = bDate;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public ArrayList<String> getTel() {
        return tel;
    }

    public void setTel(ArrayList<String> tel) {
        this.tel = tel;
    }

    public LocalDate getChangeDate() {
        return ChangeDate;
    }

    public static void setChangeDate(LocalDate changeDate) {
        ChangeDate = changeDate;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "FIO='" + FIO + '\'' +
                ", bDate='" + bDate + '\'' +
                ", adres='" + adres + '\'' +
                ", tel=" + tel +
                ", ChangeDate=" + ChangeDate +
                '}';
    };
};

