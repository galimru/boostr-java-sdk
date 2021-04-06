package com.github.galimru.boostrsdk.exceptions;

public class ServerException extends RuntimeException {

    private final int status;

    public ServerException(String message, int status) {
        super(message);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
