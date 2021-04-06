package com.github.galimru.boostrsdk;

import com.github.galimru.boostrsdk.exceptions.ApiException;
import com.github.galimru.boostrsdk.http.Credentials;
import com.github.galimru.boostrsdk.model.UserTokenResponse;
import com.github.galimru.boostrsdk.logging.Level;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

public class AuthServiceTest {

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
    public void getTokenShouldWork() throws IOException, ApiException {
        UserTokenResponse response = client.auth().getToken(TestConstants.USERNAME, TestConstants.PASSWORD);
        Assert.assertNotNull(response.getJwt());
    }

}
