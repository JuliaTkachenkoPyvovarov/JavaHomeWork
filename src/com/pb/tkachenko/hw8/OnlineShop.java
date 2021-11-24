package com.pb.tkachenko.hw8;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Auth auth = new Auth();
        Scanner scan = new Scanner(System.in);
    }

        private static void signUp(Scanner scan, Auth auth) {
            System.out.println("Введите login для регистрации на сайте");
            String login = scan.next();

            System.out.println("Введите пароль: ");
            String password = scan.next();

            System.out.println("Подтвердите пароль: ");
            String confirmPassword = scan.next();

            try {
                auth.signUp(login, password, confirmPassword);
                System.out.println("Регистрация выполнена успешно!");
            } catch (WrongLoginException ex) {
                System.out.println("Пароль некорректный");
                ex.printStackTrace();
            } catch (WrongPasswordException wl) {
                System.out.println("Логин (login) некорректный");
                wl.printStackTrace();
            }
        }
        private static void signIn (Scanner scan, Auth auth) {
            System.out.println("Введите login для авторизации на сайте");
            String login = scan.next();

            System.out.println("Введите пароль: ");
            String password = scan.next();

            try {
                auth.signIn("ldap", "password1");
            } catch (WrongPasswordException wl) {
                System.out.println("Введены некорректные данные");
                wl.printStackTrace();
            }
        }
    }