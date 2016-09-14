package models.dao;

import library.db.JdbcTemplateBase;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

/**
 * Created by peter on 2016/9/11.
 * 这种方式会造成每次使用此类，就需要重新建立连接
 */
public class UserDao extends JdbcTemplateBase{
    public static final String tableName = "user";
    public static final String dataBaseName = "userDataSource";

    public UserDao() {
        this.setTableName(tableName);
        this.setJdbcTemplate(dataBaseName);
    }

    public User getUserById(int id) {
        String sql = "SELECT * FROM "+this.getTableName()+" WHERE id = ?";
        User user = (User)this.getJdbcTemplate().queryForObject(
                sql, new Object[] { id },
                new BeanPropertyRowMapper(User.class));

        return user;
    }
}
