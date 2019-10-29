package com.demo.SpringSecuritydb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringSecurityRegistrationLoginLogoutWithThymlefeApplication extends SpringBootServletInitializer  {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringSecurityRegistrationLoginLogoutWithThymlefeApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityRegistrationLoginLogoutWithThymlefeApplication.class, args);
	}

}