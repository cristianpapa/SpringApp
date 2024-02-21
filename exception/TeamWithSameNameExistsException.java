package com.examen.examen.exception;

public class TeamWithSameNameExistsException extends RuntimeException {

    public TeamWithSameNameExistsException() {
        super("The team already exists");
    }
}
