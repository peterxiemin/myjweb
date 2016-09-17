package actions;


import models.service.page.MysqlTestPage;

/**
 * Created by peter on 2016/9/17.
 */
public class MysqlTestAction {
    private MysqlTestPage objServicePageMysqlTest;
    public MysqlTestAction() {
        this.objServicePageMysqlTest = new MysqlTestPage();
    }
    public String execute() {
        String ret = objServicePageMysqlTest.execute();
        return ret;
    }
}
