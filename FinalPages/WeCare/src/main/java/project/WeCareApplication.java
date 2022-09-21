package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin
@SpringBootApplication
public class WeCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeCareApplication.class, args);
	}

}
