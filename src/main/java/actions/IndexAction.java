package actions;

import models.service.page.IndexPage;

/**
 * Created by peter on 2016/9/9.
 */
public class IndexAction {
    private IndexPage objServicePageIndex;
    public IndexAction() {
        this.objServicePageIndex = new IndexPage();
    }
    public String execute() {
        String ret = objServicePageIndex.execute();
        return ret;
    }
}
