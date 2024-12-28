package ucu.edu.ua;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PDLReader {
    private static final String API_KEY = "your_pdl_api_key";

    public String getCompanyData(String website) {
        try {
            URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=" + website);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Api-Key", API_KEY);

            connection.connect();
            Scanner scanner = new Scanner(connection.getInputStream());
            String response = scanner.useDelimiter("\\Z").next();
            scanner.close();

            return response;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String parseCompanyName(String jsonResponse) {
        JSONObject jsonObject = new JSONObject(jsonResponse);
        return jsonObject.optString("name", "Unknown Company");
    }
}
