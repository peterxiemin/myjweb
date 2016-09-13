package actions;

import models.service.page.RedisTestPage;

/**
 * Created by peter on 2016/9/13.
 */
public class RedisTestAction {
    private RedisTestPage redisTestPage;
    public RedisTestAction() {
        this.redisTestPage = new RedisTestPage();
    }
    public String execute() {
        return redisTestPage.execute();
    }
}
