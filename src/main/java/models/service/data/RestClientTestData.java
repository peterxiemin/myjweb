package models.service.data;

import library.http.RestTemplateClient;
import org.springframework.web.client.RestTemplate;

/**
 * Created by peter on 2016/9/13.
 */
public class RestClientTestData {
    public RestClientTestData() {
    }

    public String getRestContent() {
        RestTemplate restTemplate = RestTemplateClient.getInstance();
        String uri = "http://www.baidu.com/";
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }
}
