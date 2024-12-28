import org.junit.jupiter.api.Test;

import ucu.edu.ua.FacebookUser;
import ucu.edu.ua.FacebookUserAdapter;
import ucu.edu.ua.MessageSender;
import ucu.edu.ua.TwitterUser;
import ucu.edu.ua.TwitterUserAdapter;
import ucu.edu.ua.User;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class MessageSenderTests {

    @Test
    public void testMessageSenderWithActiveUser() {
        TwitterUser twitterUser = new TwitterUser("twitter@example.com", "USA", Instant.now().toEpochMilli());
        User twitterAdapter = new TwitterUserAdapter(twitterUser);

        FacebookUser facebookUser = new FacebookUser("facebook@example.com", "USA", Instant.now().toEpochMilli());
        User facebookAdapter = new FacebookUserAdapter(facebookUser);

        MessageSender sender = new MessageSender();

        sender.send("Hello from Twitter!", twitterAdapter, "USA");
        sender.send("Hello from Facebook!", facebookAdapter, "USA");
    }

    @Test
    public void testMessageSenderWithInactiveUser() {
        TwitterUser twitterUser = new TwitterUser("twitter@example.com", "USA", Instant.now().minus(2, ChronoUnit.HOURS).toEpochMilli());
        User twitterAdapter = new TwitterUserAdapter(twitterUser);

        MessageSender sender = new MessageSender();

        sender.send("Hello from Twitter!", twitterAdapter, "USA");
    }

    @Test
    public void testMessageSenderWithDifferentCountry() {
        FacebookUser facebookUser = new FacebookUser("facebook@example.com", "UK", Instant.now().toEpochMilli());
        User facebookAdapter = new FacebookUserAdapter(facebookUser);

        MessageSender sender = new MessageSender();

        sender.send("Hello from Facebook!", facebookAdapter, "USA");
    }
}
