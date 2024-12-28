package ucu.edu.ua;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class MessageSender {
    public void send(String text, User user, String country) {
        long currentTime = Instant.now().toEpochMilli();
        long oneHourAgo = Instant.now().minus(1, ChronoUnit.HOURS).toEpochMilli();

        if (user.getCountry().equalsIgnoreCase(country) && user.getLastActiveTime() >= oneHourAgo) {
            System.out.println("Sending message: " + text + " to " + user.getEmail());
        } else {
            System.out.println("User is not eligible for the message.");
        }
    }
}
