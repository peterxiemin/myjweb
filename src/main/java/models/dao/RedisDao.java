package models.dao;

import library.cache.RedisTemplateBase;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by peter on 2016/9/11.
 */
public class RedisDao extends RedisTemplateBase {
    public static final String redisConnectionFactoryName = "jedisConnectionFactory";
    public RedisDao() {
        this.setRedisConnectionFactory(redisConnectionFactoryName);
    }

    public void setTest() {
        this.push("xiemin", "xieminshitiancai");
    }
}
