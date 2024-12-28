import org.junit.jupiter.api.Test;

import ucu.edu.ua.FacebookUser;
import ucu.edu.ua.FacebookUserAdapter;
import ucu.edu.ua.TwitterUser;
import ucu.edu.ua.TwitterUserAdapter;
import ucu.edu.ua.User;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserAdapterTests {

    @Test
    public void testTwitterUserAdapter() {
        // Mock TwitterUser
        TwitterUser twitterUser = new TwitterUser("twitter@example.com", "USA", Instant.now().toEpochMilli());
        User twitterAdapter = new TwitterUserAdapter(twitterUser);

        // Assertions
        assertEquals("twitter@example.com", twitterAdapter.getEmail());
        assertEquals("USA", twitterAdapter.getCountry());
        assertTrue(twitterAdapter.getLastActiveTime() <= Instant.now().toEpochMilli());
    }

    @Test
    public void testFacebookUserAdapter() {
        // Mock FacebookUser
        FacebookUser facebookUser = new FacebookUser("facebook@example.com", "UK", Instant.now().toEpochMilli());
        User facebookAdapter = new FacebookUserAdapter(facebookUser);

        // Assertions
        assertEquals("facebook@example.com", facebookAdapter.getEmail());
        assertEquals("UK", facebookAdapter.getCountry());
        assertTrue(facebookAdapter.getLastActiveTime() <= Instant.now().toEpochMilli());
    }
}
