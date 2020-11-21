import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class InitAuth {

    public static void main(String[] args) {




        //request something
        HttpClient client = HttpClients.custom().build();
        HttpUriRequest request = RequestBuilder.get()
                .setUri("api.schoology.com")
                .setHeader("Accept", "application/json")
                .setHeader("Host", "api.schoology.com")
                .setHeader("Authorization", "OAuth realm=\"Schoology API\", " +
                        "oauth_consumer_key=\"dpf43f3p2l4k3l03\", " +
                        "oauth_token=\"nnch734d00sl2jdk\", " +
                        "oauth_nonce=\"kllo9940pd9333jh\", " +
                        "oauth_timestamp=\"1191242096\", " +
                        "oauth_signature_method=\"HMAC-SHA1\", " +
                        "oauth_version=\"1.0\", " +
                        "oauth_signature=\"WPzmzWV5A32eHbq4yYB9gyZOEgg%3D\")")
                .build();
        try {
            client.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Authorization: OAuth realm="Schoology API",
//                oauth_consumer_key="dpf43f3p2l4k3l03",
//                oauth_token="nnch734d00sl2jdk",
//                oauth_nonce="kllo9940pd9333jh",
//                oauth_timestamp="1191242096",
//                oauth_signature_method="HMAC-SHA1",
//                oauth_version="1.0",
//                oauth_signature="WPzmzWV5A32eHbq4yYB9gyZOEgg%3D"+
    }
}