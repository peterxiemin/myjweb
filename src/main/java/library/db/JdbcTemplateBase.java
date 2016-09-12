package library.db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by peter on 2016/9/11.
 */
public class JdbcTemplateBase {

    private DataSource dataSource;
    private String tableName;
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplateBase() {

    }

    protected JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }

    protected void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    protected void setJdbcTemplate(String dataSourceName) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("jdbc-context.xml");
        this.dataSource = (DataSource)context.getBean(dataSourceName);
        this.jdbcTemplate = new JdbcTemplate(this.dataSource);
    }

    protected DataSource getDataSource() {
        return this.dataSource;
    }

    protected void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    protected String getTableName() {
        return this.tableName;
    }

    protected void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
