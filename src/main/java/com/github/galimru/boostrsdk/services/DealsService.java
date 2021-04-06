package com.github.galimru.boostrsdk.services;

import com.github.galimru.boostrsdk.api.DealsApi;
import com.github.galimru.boostrsdk.exceptions.ApiException;
import com.github.galimru.boostrsdk.http.Authenticator;
import com.github.galimru.boostrsdk.model.Deal;
import com.github.galimru.boostrsdk.model.DealResponse;
import com.github.galimru.boostrsdk.model.Filter;
import com.github.galimru.boostrsdk.model.Pagination;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class DealsService extends AbstractService {

    private final DealsApi api;
    private final Authenticator authenticator;

    public DealsService(Retrofit retrofit, Authenticator authenticator) {
        this.api = retrofit.create(DealsApi.class);
        this.authenticator = authenticator;
    }

    public List<DealResponse> list() throws IOException, ApiException {
        return list(Filter.empty(), Pagination.unpaged());
    }

    public List<DealResponse> list(Pagination pagination) throws IOException, ApiException {
        return list(Filter.empty(), pagination);
    }

    public List<DealResponse> list(Filter filter) throws IOException, ApiException {
        return list(filter, Pagination.unpaged());
    }

    public List<DealResponse> list(Filter filter, Pagination pagination) throws IOException, ApiException {
        Objects.requireNonNull(pagination, "pagination is null");
        Response<List<DealResponse>> response = authenticator.call(() ->
                api.list(filter.getId(), pagination.getPage(), pagination.getSize(),
                        filter.getCreatedAt(), filter.getCreatedAtCondition(),
                        filter.getUpdatedAt(), filter.getUpdatedAtCondition(),
                        filter.getCreatedAtStart(), filter.getCreatedAtEnd(),
                        filter.getUpdatedAtStart(), filter.getUpdatedAtEnd(),
                        filter.getDeletedAt(), filter.getDeletedAtCondition(),
                        filter.getClosedAt(), filter.getClosedAtCondition())
                        .execute());

        throwErrorIfNeeded(response);
        return response.body();
    }

    public DealResponse get(Integer id) throws IOException, ApiException {
        Objects.requireNonNull(id, "id is null");
        Response<DealResponse> response = authenticator.call(() -> api.get(id).execute());

        throwErrorIfNeeded(response);
        return response.body();
    }

    public DealResponse update(Integer id, Deal deal) throws IOException, ApiException {
        Objects.requireNonNull(id, "id is null");
        Response<DealResponse> response = authenticator.call(() -> api.update(id, deal.asWrapper()).execute());

        throwErrorIfNeeded(response);
        return response.body();
    }

    public DealResponse create(Deal deal) throws IOException, ApiException {
        Response<DealResponse> response = authenticator.call(() -> api.create(deal.asWrapper()).execute());

        throwErrorIfNeeded(response);
        return response.body();
    }
}
