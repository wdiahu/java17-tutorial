package ahu.wudi.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        syncRequest();
        //asyncRequest();
    }

    private static void syncRequest() throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder()
                .uri(URI.create("http://wudibalala.top"))
                .build();
        var client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

    private static void asyncRequest() {
        var request = HttpRequest.newBuilder()
                .uri(URI.create("http://wudibalala.top"))
                .build();
        var client = HttpClient.newHttpClient();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);
    }
}
