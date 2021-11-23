package com.pb.tkachenko.hw8;

import  java.util.regex.Pattern;

public class Auth {
   String login;
   String password;

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void signUp(String login, String password, String confirmPassword)  throws WrongLoginException, WrongPasswordException  {

            if (login.length() > 5) {
        //(Pattern.matches("[^a-zA-Z0-9] {5,20}", login)) { //(login.length() > 5 && login.length() < 20 ) {
                    String ldap = login;
                    System.out.println("Ваш логин "+ ldap);
            } else {
                String message = "ошибка" ;
                throw new WrongLoginException(message);
            }

            if (password.length()>5 && Pattern.matches("[A-Za-z0-9_]", password)) {
                System.out.println("Пароль корректный");
            } else {
                String message = "ошибка";
                throw new WrongPasswordException(message);
            }

            if (password.equals(confirmPassword)){
                String password1 = password;
                System.out.println("Пароль корректный");
            } else {
                throw new WrongPasswordException("Повторите пароль");
            }
    }
    public void signIn(String ldap, String password1)  throws WrongPasswordException {
        if (login.equals(ldap) && password.equals(password1)) {
            System.out.println("Регистрация успе!шна");
        } else {
            String message = "Связка логин-пароль не совпадает";
            throw new WrongPasswordException(message);

        }

    }
};

//- signIn (вход на сайт) принимающий login и password.
//Проверяет что login и password соответствуют значениям из полей класса.
//Если нет - выбрасывает исключение WrongLoginException.
//
//WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
// – один по умолчанию, второй принимает сообщение и передает его в конструктор класса Exception.
//
//Создать класс OnlineShop с методом main.
//В main создать один объект класса Auth.
//Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
//Обработать исключения методов signUp signIn с помощью блоков try-catch.
