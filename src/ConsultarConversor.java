import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarConversor {
    Moneda convertirMoneda(String base, String target, double amount){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/1c9403e82c9f975f7e82682f/pair/"+
                base +"/" + target + "/" + amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =  HttpRequest.newBuilder().uri(direccion).build();

        HttpResponse<String> response = null;

        try {
            response = client.
                    send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
