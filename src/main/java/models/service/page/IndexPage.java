package models.service.page;

import models.dao.IndexDao;
import models.dao.User;
import models.service.data.IndexData;

/**
 * Created by peter on 2016/9/9.
 */
public class IndexPage {
    private IndexData objServiceDataIndex;
    public IndexPage() {
        this.objServiceDataIndex = new IndexData();
    }
    public String execute() {
        User user = objServiceDataIndex.getUser();
        return user.getFirstName();
    }
}
