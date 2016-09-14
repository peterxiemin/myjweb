package library.db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * Created by xiemin02 on 2016/9/14.
 */
public class DbFactory {
    public static HashMap<String, JdbcTemplate> jdbctplMap = new HashMap<String, JdbcTemplate>();
    public DbFactory() {

    }

    public static JdbcTemplate getJdbcTemplate(String dataSourceName) {
        /**
         * 如果列表中存在就直接返回
         */
        if (!jdbctplMap.isEmpty() && jdbctplMap.containsKey(dataSourceName)) {
            return jdbctplMap.get(dataSourceName);
        }

        ApplicationContext context =
                new ClassPathXmlApplicationContext("myjweb-context.xml");
        DataSource dataSource = (DataSource)context.getBean(dataSourceName);
        jdbctplMap.put(dataSourceName, new JdbcTemplate(dataSource));
        return jdbctplMap.get(dataSourceName);
    }

}
