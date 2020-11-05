package com.innowise.darya.exception;

public class ThereIsNoSuchException extends RuntimeException {

    private String fieldName;

    public ThereIsNoSuchException(String fieldName) {
        this.fieldName = fieldName;
    }

    public ThereIsNoSuchException(String message, String fieldName) {
        super(message);
        this.fieldName = fieldName;
    }

    public ThereIsNoSuchException(String message, Throwable cause, String fieldName) {
        super(message, cause);
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
