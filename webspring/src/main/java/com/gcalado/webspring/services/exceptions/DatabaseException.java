package com.gcalado.webspring.services.exceptions;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg) {
        super(msg);
    }
}
