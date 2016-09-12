package library.cache;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;

/**
 * Created by peter on 2016/9/11.
 */
public class RedisTemplateBase {
    private RedisConnectionFactory redisConnectionFactory;
    private StringRedisTemplate stringRedisTemplate;

    protected void setRedisConnectionFactory(String redisConnectionFactoryName) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("redis-context.xml");
        this.redisConnectionFactory = (RedisConnectionFactory)context.getBean(redisConnectionFactoryName);
        this.stringRedisTemplate = new StringRedisTemplate(this.redisConnectionFactory);
    }

    /**
     * 压栈
     *
     * @param key
     * @param value
     * @return
     */
    public Long push(String key, String value) {
        return this.stringRedisTemplate.opsForList().leftPush(key, value);
    }

    /**
     * 出栈
     *
     * @param key
     * @return
     */
    public String pop(String key) {
        return this.stringRedisTemplate.opsForList().leftPop(key);
    }

    /**
     * 入队
     *
     * @param key
     * @param value
     * @return
     */
    public Long in(String key, String value) {
        return this.stringRedisTemplate.opsForList().rightPush(key, value);
    }

    /**
     * 出队
     *
     * @param key
     * @return
     */
    public String out(String key) {
        return this.stringRedisTemplate.opsForList().leftPop(key);
    }

    /**
     * 栈/队列长
     *
     * @param key
     * @return
     */
    public Long length(String key) {
        return this.stringRedisTemplate.opsForList().size(key);
    }

    /**
     * 范围检索
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    public List<String> range(String key, int start, int end) {
        return this.stringRedisTemplate.opsForList().range(key, start, end);
    }

    /**
     * 移除
     *
     * @param key
     * @param i
     * @param value
     */
    public void remove(String key, long i, String value) {
        this.stringRedisTemplate.opsForList().remove(key, i, value);
    }

    /**
     * 检索
     *
     * @param key
     * @param index
     * @return
     */
    public String index(String key, long index) {
        return this.stringRedisTemplate.opsForList().index(key, index);
    }

    /**
     * 置值
     *
     * @param key
     * @param index
     * @param value
     */
    public void set(String key, long index, String value) {
        this.stringRedisTemplate.opsForList().set(key, index, value);
    }

    /**
     * 裁剪
     *
     * @param key
     * @param start
     * @param end
     */
    public void trim(String key, long start, int end) {
        this.stringRedisTemplate.opsForList().trim(key, start, end);
    }
}
