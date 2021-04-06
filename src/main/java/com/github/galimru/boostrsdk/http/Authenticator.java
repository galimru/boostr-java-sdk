package com.github.galimru.boostrsdk.http;

import com.github.galimru.boostrsdk.BoostrClient;
import com.github.galimru.boostrsdk.exceptions.ApiException;
import com.github.galimru.boostrsdk.exceptions.ServerException;
import com.github.galimru.boostrsdk.model.UserTokenResponse;

import java.io.IOException;
import java.util.concurrent.Callable;

public class Authenticator {

    private static final int UNAUTHORIZED = 401;

    private final BoostrClient client;
    private final Credentials credentials;

    private String token;

    public Authenticator(BoostrClient client, Credentials credentials) {
        this.client = client;
        this.credentials = credentials;
    }

    public <T> T call(Callable<T> callable) throws IOException, ApiException {
        checkAuthorization();
        try {
            return invoke(callable);
        } catch (ServerException e) {
            if (e.getStatus() == UNAUTHORIZED) {
                authorize();
                return invoke(callable);
            } else {
                throw e;
            }
        }
    }

    public String getToken() {
        return token;
    }

    private void authorize() throws IOException, ApiException {
        UserTokenResponse tokenResponse = client.auth().getToken(
                credentials.getUsername(), credentials.getPassword());
        token = tokenResponse.getJwt();
    }

    private void checkAuthorization() throws IOException, ApiException {
        if (token == null) {
            authorize();
        }
    }

    private <T> T invoke(Callable<T> callable) {
        try {
            return callable.call();
        } catch (ServerException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
