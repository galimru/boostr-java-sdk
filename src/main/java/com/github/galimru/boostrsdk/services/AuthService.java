package com.github.galimru.boostrsdk.services;

import com.github.galimru.boostrsdk.api.UserTokenApi;
import com.github.galimru.boostrsdk.exceptions.ApiException;
import com.github.galimru.boostrsdk.model.UserToken;
import com.github.galimru.boostrsdk.model.UserTokenResponse;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.Objects;

public class AuthService extends AbstractService {

    private final UserTokenApi api;

    public AuthService(Retrofit retrofit) {
        this.api = retrofit.create(UserTokenApi.class);
    }

    public UserTokenResponse getToken(String username, String password) throws IOException, ApiException {
        Objects.requireNonNull(username, "username is null");
        Objects.requireNonNull(password, "password is null");

        UserToken auth = new UserToken();
        auth.setEmail(username);
        auth.setPassword(password);

        Response<UserTokenResponse> response = api.getUserToken(auth.asWrapper())
                .execute();

        throwErrorIfNeeded(response);
        return response.body();
    }

}
