package com.github.galimru.boostrsdk.services;

import com.github.galimru.boostrsdk.api.UsersApi;
import com.github.galimru.boostrsdk.exceptions.ApiException;
import com.github.galimru.boostrsdk.http.Authenticator;
import com.github.galimru.boostrsdk.model.*;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class UsersService extends AbstractService {

    private final UsersApi api;
    private final Authenticator authenticator;

    public UsersService(Retrofit retrofit, Authenticator authenticator) {
        this.api = retrofit.create(UsersApi.class);
        this.authenticator = authenticator;
    }

    public List<UserResponse> list() throws IOException, ApiException {
        return list(Filter.empty(), Pagination.unpaged());
    }

    public List<UserResponse> list(Pagination pagination) throws IOException, ApiException {
        return list(Filter.empty(), pagination);
    }

    public List<UserResponse> list(Filter filter) throws IOException, ApiException {
        return list(filter, Pagination.unpaged());
    }

    public List<UserResponse> list(Filter filter, Pagination pagination) throws IOException, ApiException {
        Objects.requireNonNull(pagination, "pagination is null");
        Response<List<UserResponse>> response = authenticator.call(() ->
                api.list(filter.getId(), pagination.getPage(), pagination.getSize(),
                        filter.getCreatedAt(), filter.getCreatedAtCondition(),
                        filter.getUpdatedAt(), filter.getUpdatedAtCondition(),
                        filter.getCreatedAtStart(), filter.getCreatedAtEnd(),
                        filter.getUpdatedAtStart(), filter.getUpdatedAtEnd())
                        .execute());


        throwErrorIfNeeded(response);
        return response.body();
    }

    public UserResponse get(Integer id) throws IOException, ApiException {
        Objects.requireNonNull(id, "id is null");
        Response<UserResponse> response = authenticator.call(() -> api.get(id).execute());

        throwErrorIfNeeded(response);
        return response.body();
    }

    public UserResponse update(Integer id, User user) throws IOException, ApiException {
        Objects.requireNonNull(id, "id is null");
        Response<UserResponse> response = authenticator.call(() -> api.update(id, user.asWrapper()).execute());

        throwErrorIfNeeded(response);
        return response.body();
    }

    public UserResponse create(User user) throws IOException, ApiException {
        Response<UserResponse> response = authenticator.call(() -> api.create(user.asWrapper()).execute());

        throwErrorIfNeeded(response);
        return response.body();
    }
}
