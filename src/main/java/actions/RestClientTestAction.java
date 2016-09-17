package actions;


import models.service.page.RestClientTestPage;

/**
 * Created by peter on 2016/9/17.
 */
public class RestClientTestAction {
    private RestClientTestPage restClientTestPage;
    public RestClientTestAction() {
        this.restClientTestPage = new RestClientTestPage();
    }

    public String execute() {
        return restClientTestPage.execute();
    }
}
