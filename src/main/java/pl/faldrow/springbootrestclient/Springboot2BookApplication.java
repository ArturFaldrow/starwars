package pl.faldrow.springbootrestclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients(basePackages = {"pl.faldrow.springbootrestclient.feign"})
//      @EnableFeignClients(basePackages = {"com.example.feign.feign", "com.example.feign.controller"})
public class Springboot2BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2BookApplication.class, args);
    }

}
