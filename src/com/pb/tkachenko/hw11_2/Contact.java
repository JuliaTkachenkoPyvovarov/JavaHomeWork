package com.pb.tkachenko.hw11_2;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Contact {
    String FIO;
    String bDate;
    String adres;
    ArrayList<String> tel = new ArrayList<>();
    LocalDateTime ChangeDate;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public ArrayList<String> getTel() {
        return tel;
    }

    public void setTel(ArrayList<String> tel) {
        this.tel = tel;
    }

    //Constructor
    public Contact(String FIO, String BDate, String adres, ArrayList<String> tel, LocalDateTime changeDate) {
        this.FIO = FIO;
        this.bDate = bDate;
        this.adres = adres;
        this.tel = tel;
        ChangeDate = changeDate;

        System.out.println(FIO + ", " + bDate + ", " + adres + ", " + tel + ", " + ChangeDate);
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
    }
}
