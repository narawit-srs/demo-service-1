package demoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class DemoServiceApplication {

    @RequestMapping("/")
    String index() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }
}