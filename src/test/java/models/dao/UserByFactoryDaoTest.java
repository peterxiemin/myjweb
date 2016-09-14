package models.dao;

import org.junit.Test;

/**
 * Created by xiemin02 on 2016/9/14.
 */
public class UserByFactoryDaoTest {
    private static UserByFactoryDao uf = new UserByFactoryDao();

    @Test
    public void getUserById() throws Exception {
        User user = uf.getUserById(1);
        System.out.println(user.getLastName());
    }

}