package com.github.galimru.boostrsdk.services;

import com.github.galimru.boostrsdk.exceptions.ApiException;
import com.github.galimru.boostrsdk.exceptions.ServerException;
import okhttp3.ResponseBody;
import retrofit2.Response;

import java.io.IOException;

public abstract class AbstractService {

    public void throwErrorIfNeeded(Response<?> response) throws ApiException {
        if (!response.isSuccessful()) {
            ResponseBody errorBody = response.errorBody();
            if (errorBody == null || errorBody.contentLength() == 0) {
                throw new ServerException(String.format("%d %s", response.code(), response.message()), response.code());
            }
            try {
                throw new ApiException(errorBody.string());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
