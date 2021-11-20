package com.pb.tkachenko.hw8;

public class WrongLoginException extends Exception {

    public String login;

    public WrongLoginException(String login) {
        this.login = login;
    }
}