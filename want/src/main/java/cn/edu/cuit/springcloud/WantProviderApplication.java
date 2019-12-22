package cn.edu.cuit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cn.edu.cuit.want")
public class WantProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(WantProviderApplication.class, args);
    }
}
