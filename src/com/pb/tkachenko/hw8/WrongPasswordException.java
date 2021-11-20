package com.pb.tkachenko.hw8;

public class WrongPasswordException extends Exception {
    String password;
    String confirmPassword;
    public WrongPasswordException(String password) {
    }
}
