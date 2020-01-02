package pub.ants.miaosha.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author magw
 * @version 1.0
 * @date 2020/1/3 上午12:05
 * @description: No Description
 */
@Service
public class RedisPoolFactory {
    @Autowired
    RedisConfig redisConfig;
    

    @Bean
    public JedisPool JedisPoolFactory() {

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(redisConfig.getMaxIdle());
        jedisPoolConfig.setMaxTotal(redisConfig.getMaxTotal());
        jedisPoolConfig.setMaxWaitMillis(redisConfig.getMaxWaitMillis());
        JedisPool jp = new JedisPool(jedisPoolConfig, redisConfig.getHost(), redisConfig.getPort(),
                redisConfig.getTimeout(), redisConfig.getPassword(), redisConfig.getDatabase());
        return jp;
    }
}
