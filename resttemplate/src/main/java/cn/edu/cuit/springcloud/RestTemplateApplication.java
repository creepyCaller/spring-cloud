package cn.edu.cuit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"cn.edu.cuit.user", "cn.edu.cuit.want"})
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class, args);
    }

    @Bean //注解为Bean，在启动时直接通过注解就可以获取RestTemplate实例
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
