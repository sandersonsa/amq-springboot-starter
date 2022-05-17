package xyz.sandersonsa.amqspringbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class AmqSpringbootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmqSpringbootStarterApplication.class, args);
	}

}
