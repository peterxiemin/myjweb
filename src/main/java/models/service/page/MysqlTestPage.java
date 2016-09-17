package models.service.page;

import models.dao.User;
import models.service.data.IndexData;
import models.service.data.MysqlTestData;

/**
 * Created by peter on 2016/9/17.
 */
public class MysqlTestPage {
    private MysqlTestData objServiceDataMysqlTest;
    public MysqlTestPage() {
        this.objServiceDataMysqlTest = new MysqlTestData();
    }
    public String execute() {
        User user = objServiceDataMysqlTest.getUser();
        return user.getFirstName();
    }
}
