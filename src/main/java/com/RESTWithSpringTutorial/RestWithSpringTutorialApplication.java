package com.RESTWithSpringTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class RestWithSpringTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWithSpringTutorialApplication.class, args);
	}

}
