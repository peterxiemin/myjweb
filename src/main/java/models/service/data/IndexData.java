package models.service.data;

import models.dao.RedisDao;
import models.dao.User;
import models.dao.UserDao;

/**
 * Created by peter on 2016/9/9.
 */
public class IndexData {
    private UserDao objDaoUser;
    private RedisDao objDaoRedis;
    public IndexData() {
        this.objDaoUser = new UserDao();
        this.objDaoRedis = new RedisDao();
    }
    public User getUser() {
        this.objDaoRedis.setTest();
        return this.objDaoUser.getUserById(0);
    }
}
