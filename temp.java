import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;


public class temp {
    private static final String API_KEY = "YOUR_API_KEY";
    private static final String API_URL = "https://api.example.com/weather";

    public static void main(String[] args) {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Set the API key in the request headers if required
            connection.setRequestProperty("Authorization", "Bearer " + API_KEY);

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parse the response and extract the required data
                String temperature = parseTemperature(response.toString());
                String humidity = parseHumidity(response.toString());
                String windSpeed = parseWindSpeed(response.toString());

                // Do something with the weather data
                System.out.println("Temperature: " + temperature);
                System.out.println("Humidity: " + humidity);
                System.out.println("Wind Speed: " + windSpeed);
            } else {
                System.out.println("Error: " + responseCode);
            }

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  private static String parseTemperature(String response) {
    // Parse the temperature from the JSON response
    JSONObject jsonResponse = new JSONObject(response);
    double temperature = jsonResponse.getJSONObject("main").getDouble("temp");
    return temperature + "°C";
}

private static String parseHumidity(String response) {
    // Parse the humidity from the JSON response
    JSONObject jsonResponse = new JSONObject(response);
    int humidity = jsonResponse.getJSONObject("main").getInt("humidity");
    return humidity + "%";
}

private static String parseWindSpeed(String response) {
    // Parse the wind speed from the JSON response
    JSONObject jsonResponse = new JSONObject(response);
    double windSpeed = jsonResponse.getJSONObject("wind").getDouble("speed");
    return windSpeed + " km/h";
}
}