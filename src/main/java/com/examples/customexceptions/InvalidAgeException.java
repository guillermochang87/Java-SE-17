package com.examples.customexceptions;

public class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }

}
