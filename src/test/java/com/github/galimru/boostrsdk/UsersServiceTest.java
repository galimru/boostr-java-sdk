package com.github.galimru.boostrsdk;

import com.github.galimru.boostrsdk.exceptions.ApiException;
import com.github.galimru.boostrsdk.http.Credentials;
import com.github.galimru.boostrsdk.logging.Level;
import com.github.galimru.boostrsdk.model.User;
import com.github.galimru.boostrsdk.model.UserList;
import com.github.galimru.boostrsdk.model.UserResponse;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class UsersServiceTest {

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
    public void listUsersShouldWork() throws IOException, ApiException {
        List<UserResponse> users = client.users().list();
        Assert.assertNotNull(users);
        Assert.assertFalse(users.isEmpty());
    }

    @Test
    public void getUserShouldWork() throws IOException, ApiException {
        UserResponse user = client.users().get(TestConstants.USER_ID);
        Assert.assertNotNull(user);
    }

    @Test
    public void updateUserShouldWork() throws IOException, ApiException {
        User user = new User();
        user.setLastName("Test LastName");
        UserResponse response = client.users().update(TestConstants.USER_ID, user);
        Assert.assertEquals("Test LastName", response.getLastName());
    }

    @Test
    public void createUserShouldWork() throws IOException, ApiException {
        User user = new User();
        user.setFirstName("Test");
        user.setLastName("Test");
        String randomPrefix = UUID.randomUUID().toString().replace("-", "");
        user.setEmail(randomPrefix + "@fakeemail.com");
        UserResponse response = client.users().create(user);
        Assert.assertEquals("Test", response.getFirstName());
    }
}
