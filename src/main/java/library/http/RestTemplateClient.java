package library.http;

import org.springframework.web.client.RestTemplate;

/**
 * Created by peter on 2016/9/17.
 */
public class RestTemplateClient {
    private static RestTemplate restTemplateClient = null;
    public static RestTemplate getInstance() {
        if (restTemplateClient == null) {
            restTemplateClient = new RestTemplate();
        }
        return restTemplateClient;
    }
}
