package models.service.page;

import models.service.data.RedisTestData;

/**
 * Created by peter on 2016/9/13.
 */
public class RedisTestPage {
    private RedisTestData redisTestData;
    public RedisTestPage() {
        this.redisTestData = new RedisTestData();
    }
    public String execute() {
        return "success";
    }
}
