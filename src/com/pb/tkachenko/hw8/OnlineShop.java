package com.pb.tkachenko.hw8;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Auth auth = new Auth("ldap","password1" );
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите login для регистрации на сайте");
        auth.login = scan.next();

        try {
            auth.signUp("ldap", "pass", "pass");
        } catch (WrongPasswordException wl) {
            System.out.println("Логин (login) некорректный");
            wl.printStackTrace();
        }

        System.out.println("Введите пароль: ");
        auth.password = scan.next();

        try {
            auth.signUp("ldap", "pass", "pass");
        } catch (WrongPasswordException wl) {
            System.out.println("Логин (login) некорректный");
            wl.printStackTrace();
        }
        System.out.println("Регистрация выполнена успешно!");

        System.out.println("Войдите на сайт, используя  Ваши логин и пароль: ");
        try {
            auth.signIn("ldap", "password1");
            System.out.println("Вход на сайт выполнен успешно!");
        } catch (WrongPasswordException wl) {
            System.out.println("Введены некорректные данные");
            wl.printStackTrace();
        }
    };
};
