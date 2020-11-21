import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class InitAuth {

    public static void main(String[] args) {
        HttpClient client = HttpClients.custom().build();
        Header header =
        HttpUriRequest request = RequestBuilder.get()
                .setUri("https://milton.schoology.com/api")
                .setHeader("OAuth realm", "Schoology API")
                .build();

        Authorization: OAuth realm="Schoology API",
                oauth_consumer_key="dpf43f3p2l4k3l03",
                oauth_token="nnch734d00sl2jdk",
                oauth_nonce="kllo9940pd9333jh",
                oauth_timestamp="1191242096",
                oauth_signature_method="HMAC-SHA1",
                oauth_version="1.0",
                oauth_signature="WPzmzWV5A32eHbq4yYB9gyZOEgg%3D"
        try {
            client.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
