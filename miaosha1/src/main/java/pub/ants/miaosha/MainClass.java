package pub.ants.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author magw
 * @version 1.0
 * @date 2020/1/1 上午11:53
 * @description: spring boot 启动类
 */
@SpringBootApplication
public class MainClass {
    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }
}
