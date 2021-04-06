package com.github.galimru.boostrsdk.http;

import okhttp3.Interceptor;
import okhttp3.Response;

import javax.annotation.Nonnull;
import java.io.IOException;

public class AcceptHeaderInterceptor implements Interceptor {

    private final static String AUTHORIZATION_HEADER = "Accept";
    private final static String VND_BOOSTR_PUBLIC = "application/vnd.boostr.public";

    @Nonnull
    @Override
    public Response intercept(Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder()
                .addHeader(AUTHORIZATION_HEADER, VND_BOOSTR_PUBLIC).build());
    }
}
