import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class urlHandler {
    private static String url;

    public urlHandler(String url){
        this.url = url;
    }    

    public String request() throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient(); 
        HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .header("accept","application/json")
                    .uri(URI.create(this.url))
                    .build();
        HttpResponse <String> response =client.send(request, HttpResponse.BodyHandlers.ofString());
        // System.out.println(response.body());

        return response.body();
    }
}
