package com.kiosk.server.common.exception.custom;

public class ConflictException extends RuntimeException {

    public ConflictException(String message) {
        super(message);
    }
}
