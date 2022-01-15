package com.pb.tkachenko.hw11a;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contact implements Serializable {
    private LocalDate ChangeDate;
    private String FIO;
    private String bDate;
    private String adres;
    private ArrayList<String> tel = new ArrayList<>();


    public Contact(String FIO) {
        this.FIO = FIO;
    }

    public Contact(String FIO, String bDate) {
        this.FIO = FIO;
        this.bDate = bDate;
    }

    public Contact(String FIO, String bDate, String adres, List<String> phone2, LocalDate of) {
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

    public Contact(String newFIO, String newBDate, String newAdres, List<String> newTel) {
    }

    public static void setTel(String telNew) {
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

    public void setbDate(String bDate) {
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

    public void setChangeDate(LocalDate changeDate) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(ChangeDate, contact.ChangeDate) && Objects.equals(FIO, contact.FIO) && Objects.equals(bDate, contact.bDate) && Objects.equals(adres, contact.adres) && Objects.equals(tel, contact.tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ChangeDate, FIO, bDate, adres, tel);
    }
}
