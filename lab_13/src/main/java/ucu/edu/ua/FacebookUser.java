package ucu.edu.ua;

public class FacebookUser {
    private String email;
    private String userCountry;
    private long userActiveTime;

    public FacebookUser(String email, String userCountry, long userActiveTime) {
        this.email = email;
        this.userCountry = userCountry;
        this.userActiveTime = userActiveTime;
    }

    public String getEmail() {
        return email;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public long getUserActiveTime() {
        return userActiveTime;
    }
}