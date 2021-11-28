package com.pb.tkachenko.hw8;

import  java.util.regex.Pattern;

public class Auth {
   private String login;
   private String password;

    public void signUp(String login, String password, String confirmPassword)  throws WrongLoginException, WrongPasswordException  {

            if (!Pattern.matches("[a-zA-Z0-9]{5,20}",login)) {
                throw new WrongLoginException();
            } else {
                System.out.println("Ваш логин "+ login);
            }

            if (!Pattern.matches("[A-Za-z0-9_]", password)) {
                throw new WrongPasswordException();
            } else {
                System.out.println("Пароль корректный");
            }

            if (!password.equals(confirmPassword)){
                throw new WrongPasswordException("Повторите пароль");
            } else { System.out.println("Повтор пароля совпадает");

            }
            this.login = login;
            this.password = password;
    }
    public void signIn(String login, String password)  throws WrongPasswordException {
        if (!this.login.equals(login) || !this.password.equals(password)) {
            //String message = "Связка логин-пароль не совпадает";
            throw new WrongPasswordException();
        } else {
            System.out.println("Вход на сайт выполнен успешно!");

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
