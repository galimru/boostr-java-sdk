package com.github.galimru.boostrsdk;

import com.github.galimru.boostrsdk.exceptions.ApiException;
import com.github.galimru.boostrsdk.http.Credentials;
import com.github.galimru.boostrsdk.logging.Level;
import com.github.galimru.boostrsdk.model.DateCondition;
import com.github.galimru.boostrsdk.model.Deal;
import com.github.galimru.boostrsdk.model.DealResponse;
import com.github.galimru.boostrsdk.model.Filter;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

public class DealsServiceTest {

    private static BoostrClient client;

    @BeforeClass
    public static void setup() {
        client = BoostrClient.builder()
                .withBaseUrl(BoostrClient.SANDBOX_BASE_URL)
                .withCredentials(Credentials.of(TestConstants.USERNAME, TestConstants.PASSWORD))
                .withHttpLoggingLevel(Level.BODY)
                .build();
    }

    @Test
    public void listDealsShouldWork() throws IOException, ApiException {
        List<DealResponse> deals = client.deals().list();
        Assert.assertNotNull(deals);
        Assert.assertFalse(deals.isEmpty());
    }

    @Test
    public void listDealsWithFilterShouldWork() throws IOException, ApiException {
        Filter filter = Filter.builder()
                .byCreatedAt(DateCondition.GREATER, OffsetDateTime.parse("2021-04-05T08:15:58.191Z"))
                .build();
        List<DealResponse> deals = client.deals().list(filter);
        Assert.assertNotNull(deals);
        Assert.assertFalse(deals.isEmpty());
    }

    @Test
    public void getDealShouldWork() throws IOException, ApiException {
        DealResponse response = client.deals().get(TestConstants.DEAL_ID);
        Assert.assertNotNull(response);
    }

    @Test
    public void updateDealShouldWork() throws IOException, ApiException {
        Deal deal = new Deal();
        deal.setName("Updated Deal");
        DealResponse response = client.deals().update(TestConstants.DEAL_ID, deal);
        Assert.assertEquals("Updated Deal", response.getName());
    }

    @Test
    public void createDealShouldWork() throws IOException, ApiException {
        Deal deal = new Deal();
        deal.setName("New Deal");
        deal.setAdvertiserId(TestConstants.ADVERTISER_ID);
        deal.setStartDate(LocalDate.now());
        deal.setEndDate(LocalDate.now().plusDays(10));
        deal.setStageId(TestConstants.STAGE_ID);
        DealResponse response = client.deals().create(deal);
        Assert.assertEquals("New Deal", response.getName());
    }

}
