package models.service.data;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

/**
 * Created by peter on 2016/9/17.
 */
public class RestClientTestDataTest {
    RestClientTestData restClientTestData = new RestClientTestData();
    @Test
    public void getRestContent() throws Exception {
        String ret = restClientTestData.getRestContent();
        System.out.println(ret);
    }

}