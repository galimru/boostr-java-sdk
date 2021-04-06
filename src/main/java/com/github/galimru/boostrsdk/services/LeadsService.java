package com.github.galimru.boostrsdk.services;

import com.github.galimru.boostrsdk.api.LeadsApi;
import com.github.galimru.boostrsdk.exceptions.ApiException;
import com.github.galimru.boostrsdk.http.Authenticator;
import com.github.galimru.boostrsdk.model.Lead;
import com.github.galimru.boostrsdk.model.LeadResponse;
import com.github.galimru.boostrsdk.model.Pagination;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class LeadsService extends AbstractService {

    private final LeadsApi api;
    private final Authenticator authenticator;

    public LeadsService(Retrofit retrofit, Authenticator authenticator) {
        this.api = retrofit.create(LeadsApi.class);
        this.authenticator = authenticator;
    }

    public List<LeadResponse> list() throws IOException, ApiException {
        return list(Pagination.unpaged());
    }

    public List<LeadResponse> list(Pagination pagination) throws IOException, ApiException {
        Objects.requireNonNull(pagination, "pagination is null");
        Response<List<LeadResponse>> response = authenticator.call(() ->
                api.list(null, pagination.getPage(), pagination.getSize(), null, null, null, null, null, null, null, null)
                        .execute());


        throwErrorIfNeeded(response);
        return response.body();
    }

    public LeadResponse get(Integer id) throws IOException, ApiException {
        Objects.requireNonNull(id, "id is null");
        Response<LeadResponse> response = authenticator.call(() -> api.get(id).execute());

        throwErrorIfNeeded(response);
        return response.body();
    }

    public LeadResponse update(Integer id, Lead lead) throws IOException, ApiException {
        Objects.requireNonNull(id, "id is null");
        Response<LeadResponse> response = authenticator.call(() -> api.update(id, lead.asWrapper()).execute());

        throwErrorIfNeeded(response);
        return response.body();
    }

    public LeadResponse create(Lead lead) throws IOException, ApiException {
        Response<LeadResponse> response = authenticator.call(() -> api.create(lead.asWrapper()).execute());

        throwErrorIfNeeded(response);
        return response.body();
    }
}
