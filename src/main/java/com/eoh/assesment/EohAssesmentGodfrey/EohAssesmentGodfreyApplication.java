package com.eoh.assesment.EohAssesmentGodfrey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EohAssesmentGodfreyApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EohAssesmentGodfreyApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(EohAssesmentGodfreyApplication.class, args);
		
	}
}
