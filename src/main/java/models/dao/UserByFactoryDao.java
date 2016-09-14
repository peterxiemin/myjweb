package models.dao;

import library.db.DbFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by peter on 2016/9/11.
 * 工厂模式，保证示例只创建一次
 */
public class UserByFactoryDao {
    public static final String tableName = "user";
    public static final String dataBaseName = "userDataSource";
    private JdbcTemplate jdbcTemplate;

    public UserByFactoryDao() {
        jdbcTemplate = DbFactory.getJdbcTemplate(dataBaseName);
    }

    public User getUserById(int id) {
        String sql = "SELECT * FROM " + tableName + " WHERE id = ?";
        User user = (User) jdbcTemplate.queryForObject(
                sql, new Object[]{id},
                new BeanPropertyRowMapper(User.class));

        return user;
    }
}
