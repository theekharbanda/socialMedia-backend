package com.example.newsmedia.exceptions;

public class ResourceNotFoundException extends Exception { //checked exception
    public ResourceNotFoundException(String message) {
        super(message);
    }
    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
