package com.github.galimru.boostrsdk.http;

import okhttp3.Interceptor;
import okhttp3.Response;

import javax.annotation.Nonnull;
import java.io.IOException;

public class AuthenticationInterceptor implements Interceptor {

    private final static String AUTHORIZATION_HEADER = "Authorization";
    private final static String BEARER_PREFIX = "Bearer ";

    private final Authenticator authenticator;

    public AuthenticationInterceptor(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    @Nonnull
    @Override
    public Response intercept(Chain chain) throws IOException {
        String bearerToken = BEARER_PREFIX + authenticator.getToken();
        return chain.proceed(chain.request().newBuilder()
                .addHeader(AUTHORIZATION_HEADER, bearerToken).build());
    }
}
