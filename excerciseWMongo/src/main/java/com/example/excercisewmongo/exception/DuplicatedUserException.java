package com.example.excercisewmongo.exception;

public class DuplicatedUserException extends Exception {
    public DuplicatedUserException() {
        super("User already exists");
    }
}
