package demoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@EnableAutoConfiguration
public class DemoServiceApplication {

	@Value("${USERHELLO}")
		String user_hello;

    @RequestMapping("/")
    String index() {
        return "Hellow "+ user_hello;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }
}