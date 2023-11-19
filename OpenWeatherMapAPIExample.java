import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenWeatherMapAPIExample {
    private static final String API_KEY = "191f0a12c7b20fcb0c21511f066590a5";
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather?q=";
    private static final String CITY_NAME = "London";

    public static void main(String[] args) {
        try {
            // Construct the API URL
            String apiUrl = API_URL + CITY_NAME + "&appid=" + API_KEY;

            // Create a URL object
            URL url = new URL(apiUrl);

            // Create an HttpURLConnection object
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            // Read the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Print the response
            System.out.println(response.toString());

            // Close the connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
