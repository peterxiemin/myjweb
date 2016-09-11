package models.dao;

import library.db.JdbcTemplateBase;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.Currency;
import java.util.List;
import java.util.Map;

/**
 * Created by peter on 2016/9/11.
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
