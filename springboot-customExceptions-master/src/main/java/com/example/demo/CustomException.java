package com.example.demo;

public class CustomException extends Exception {
    public CustomException() {
        super("my own exception");
    }
}
