import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

//This File Grabs the token from openai website 
public class ChatGPToken {
	public static void listTokens() {
		try {
			//This API will fetch the models available.
			URL url = new URL("https://api.openai.com/v1/models");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Accept", "application/json");
			//Make sure you put the right Organization key saved earlier.
			con.setRequestProperty("OpenAI-Organization", "your-org-key");
			con.setDoOutput(true);
			//Make sure you put the right API Key saved earlier.
			con.setRequestProperty("Authorization", "Bearer your-api-key");
			int responseCode = con.getResponseCode();
			System.out.println("Response Code : " + responseCode);
			BufferedReader in = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println(response);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static String getChatResponse(String userPrompt) {
	    StringBuffer response = new StringBuffer();
	    try {
	        URL url = new URL("https://api.openai.com/v1/chat/completions");
	        HttpURLConnection con = (HttpURLConnection) url.openConnection();
	        con.setRequestMethod("POST");
	        con.setRequestProperty("Content-Type", "application/json");
	        con.setRequestProperty("Accept", "application/json");
	        con.setRequestProperty("OpenAI-Organization", "your-org-key");
	        con.setDoOutput(true);
	        con.setRequestProperty("Authorization", "Bearer your-api-key");

	        // Prepare JSON input with the user's prompt
	        String jsonInputString = String.format("{\"model\": \"gpt-3.5-turbo-0125\", \"messages\": [{\"role\": \"user\", \"content\": \"%s\"}]}", userPrompt);
	        try (OutputStream os = con.getOutputStream()) {
	            byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
	            os.write(input, 0, input.length);
	        }

	        int responseCode = con.getResponseCode();
	        System.out.println("Response Code : " + responseCode);
	        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	        String inputLine;
	        while ((inputLine = in.readLine()) != null) {
	            response.append(inputLine);
	        }
	        in.close();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	        return e.getMessage(); // Return the error message if an exception occurs
	    }
	    return response.toString(); // Return the response as a string
	}
	public static void main(String[] args) {
		listTokens();
	}
}