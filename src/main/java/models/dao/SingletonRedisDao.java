package models.dao;

import library.cache.RedisTemplateBase;

/**
 * Created by peter on 2016/9/11.
 */
public class SingletonRedisDao extends RedisTemplateBase {
    public static final String redisConnectionFactoryName = "jedisConnectionFactory";
    private static SingletonRedisDao instance = null;
    public static synchronized SingletonRedisDao getInstance() {
        if (instance == null) {
            instance = new SingletonRedisDao();
        }
        return instance;
    }
    public SingletonRedisDao() {
        this.setRedisConnectionFactory(redisConnectionFactoryName);
    }
}
