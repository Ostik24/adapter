package ucu.edu.ua;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class BrandfetchReader {
    private static final String API_KEY = "your_brandfetch_api_key";

    public String getLogo(String domain) {
        try {
            URL url = new URL("https://api.brandfetch.io/v2/company/" + domain);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + API_KEY);

            connection.connect();
            Scanner scanner = new Scanner(connection.getInputStream());
            String response = scanner.useDelimiter("\\Z").next();
            scanner.close();

            JSONObject jsonObject = new JSONObject(response);
            return jsonObject.getJSONArray("logos").getJSONObject(0).getString("url");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
