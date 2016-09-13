package models.dao;

import library.cache.RedisTemplateBase;

/**
 * Created by peter on 2016/9/11.
 */
public class SingletonRedisDao extends RedisTemplateBase {
    public static final String redisConnectionFactoryName = "jedisConnectionFactory";
    public static SingletonRedisDao instance;
    public static synchronized SingletonRedisDao getInstance() {
        if (instance == null) {
            return new SingletonRedisDao();
        }
        return instance;
    }
    public SingletonRedisDao() {
        this.setRedisConnectionFactory(redisConnectionFactoryName);
    }
}
