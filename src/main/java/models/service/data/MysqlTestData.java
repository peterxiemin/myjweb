package models.service.data;

import models.dao.User;
import models.dao.UserDao;

/**
 * Created by peter on 2016/9/9.
 */
public class MysqlTestData {
    private UserDao objDaoUser;
    public MysqlTestData() {
        this.objDaoUser = new UserDao();
    }
    public User getUser() {
        return this.objDaoUser.getUserById(0);
    }
}
