package com.github.galimru.boostrsdk;

import com.github.galimru.boostrsdk.exceptions.ApiException;
import com.github.galimru.boostrsdk.http.Credentials;
import com.github.galimru.boostrsdk.model.Deal;
import com.github.galimru.boostrsdk.model.DealResponse;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class BoostrClientTest {

    @Test
    @Ignore("do not need to test example")
    public void deadSimpleExample() throws IOException, ApiException {
        // create api client for sandbox environment
        Credentials credentials = Credentials.of(TestConstants.USERNAME, TestConstants.PASSWORD);
        BoostrClient client = BoostrClient.create(credentials, true);
        // get list of all deals
        List<DealResponse> deals = client.deals().list();
        // extract deal id from a deal
        Integer dealId = deals.get(0).getId();
        // update deal name by deal id
        Deal deal = new Deal();
        deal.setName("Changed Deal Name");
        client.deals().update(dealId, deal);
    }

}
