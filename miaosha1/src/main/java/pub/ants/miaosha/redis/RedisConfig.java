package pub.ants.miaosha.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "myprops")
@Data
public class RedisConfig {

    private int database;
    private String host;
    private int port;
    private String password;
    private int timeout;
    private int maxIdle;
    private int mixIdle;
    private int maxTotal;
    private long maxActive;
    private long maxWaitMillis;
    private boolean blockWhenExhausted;

 
}
