package models.service.page;

import models.service.data.RestClientTestData;

/**
 * Created by peter on 2016/9/13.
 */
public class RestClientTestPage {
    private RestClientTestData restClientTestData;
    public RestClientTestPage() {
        restClientTestData = new RestClientTestData();
    }
    public String execute() {
        String ret = restClientTestData.getRestContent();
        return ret;
    }
}
