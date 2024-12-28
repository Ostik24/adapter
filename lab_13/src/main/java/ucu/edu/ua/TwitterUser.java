package ucu.edu.ua;

public class TwitterUser {
    private String userMail;
    private String country;
    private long lastActiveTime;

    public TwitterUser(String userMail, String country, long lastActiveTime) {
        this.userMail = userMail;
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getCountry() {
        return country;
    }

    public long getLastActiveTime() {
        return lastActiveTime;
    }
}
