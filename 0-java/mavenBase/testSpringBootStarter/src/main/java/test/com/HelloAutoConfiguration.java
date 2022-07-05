package test.com;


import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 声明为配置类
 */
@Configuration
public class HelloAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean //容器中缺少该bean时进行创建
    public HelloService helloService() {
        return new HelloService();
    }

}
