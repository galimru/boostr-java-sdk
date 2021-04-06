package com.github.galimru.boostrsdk;

import com.github.galimru.boostrsdk.converters.EnumConverterFactory;
import com.github.galimru.boostrsdk.converters.LocalDateAdapter;
import com.github.galimru.boostrsdk.converters.OffsetDateTimeAdapter;
import com.github.galimru.boostrsdk.http.AcceptHeaderInterceptor;
import com.github.galimru.boostrsdk.http.AuthenticationInterceptor;
import com.github.galimru.boostrsdk.http.Authenticator;
import com.github.galimru.boostrsdk.http.Credentials;
import com.github.galimru.boostrsdk.logging.HttpLoggingInterceptor;
import com.github.galimru.boostrsdk.logging.Level;
import com.github.galimru.boostrsdk.services.AuthService;
import com.github.galimru.boostrsdk.services.DealsService;
import com.github.galimru.boostrsdk.services.LeadsService;
import com.github.galimru.boostrsdk.services.UsersService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;

public class BoostrClient {

    public final static String PRODUCTION_BASE_URL = "https://app.boostr.com/";
    public final static String SANDBOX_BASE_URL = "https://sandbox.boostr.com/";

    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

    private final AuthService authService;
    private final UsersService usersService;
    private final LeadsService leadsService;
    private final DealsService dealsService;

    public static BoostrClient create(Credentials credentials) {
        return create(credentials, false);
    }

    public static BoostrClient create(Credentials credentials, boolean sandbox) {
        return builder()
                .withBaseUrl(sandbox ? SANDBOX_BASE_URL : PRODUCTION_BASE_URL)
                .withCredentials(credentials)
                .build();
    }

    public static Builder builder() {
        return new Builder();
    }

    private BoostrClient(Builder builder) {
        Gson gson = new GsonBuilder()
                .setDateFormat(DATE_FORMAT)
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .registerTypeAdapter(OffsetDateTime.class, new OffsetDateTimeAdapter())
                .create();

        OkHttpClient authClient = builder.httpClient.newBuilder()
                .addNetworkInterceptor(new HttpLoggingInterceptor(builder.httpLoggingLevel))
                .build();

        Retrofit authRetrofit = new Retrofit.Builder()
                .baseUrl(builder.baseUrl)
                .client(authClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        authService = new AuthService(authRetrofit);

        Authenticator authenticator = new Authenticator(this, builder.credentials);

        OkHttpClient client = builder.httpClient.newBuilder()
                .addInterceptor(new AuthenticationInterceptor(authenticator))
                .addNetworkInterceptor(new AcceptHeaderInterceptor())
                .addNetworkInterceptor(new HttpLoggingInterceptor(builder.httpLoggingLevel))
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(builder.baseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addConverterFactory(EnumConverterFactory.create())
                .build();

        usersService = new UsersService(retrofit, authenticator);
        leadsService = new LeadsService(retrofit, authenticator);
        dealsService = new DealsService(retrofit, authenticator);
    }

    public AuthService auth() {
        return authService;
    }

    public UsersService users() {
        return usersService;
    }

    public LeadsService leads() {
        return leadsService;
    }

    public DealsService deals() {
        return dealsService;
    }

    public static class Builder {

        private String baseUrl;
        private Credentials credentials;
        private OkHttpClient httpClient;
        private Level httpLoggingLevel;

        public Builder withBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Builder withCredentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder withHttpClient(OkHttpClient httpClient) {
            this.httpClient = httpClient;
            return this;
        }

        public Builder withHttpLoggingLevel(Level httpLoggingLevel) {
            this.httpLoggingLevel = httpLoggingLevel;
            return this;
        }

        public BoostrClient build() {
            if (baseUrl == null) {
                baseUrl = PRODUCTION_BASE_URL;
            }
            if (httpClient == null) {
                httpClient = new OkHttpClient();
            }
            if (httpLoggingLevel == null) {
                httpLoggingLevel = Level.NONE;
            }
            Objects.requireNonNull(credentials, "credentials is null");
            return new BoostrClient(this);
        }
    }
}
