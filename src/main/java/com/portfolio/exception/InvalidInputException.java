package com.portfolio.exception;


public class InvalidInputException extends Exception {

    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(String field, String reason) {
        super("Invalid value for '" + field + "': " + reason);
    }
}
