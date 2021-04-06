package com.github.galimru.boostrsdk.http;

public class Credentials {

    private final String username;
    private final String password;

    public static Credentials of(String username, String password) {
        return new Credentials(username, password);
    }

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
