package me.tusur.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TodoappApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure
			(SpringApplicationBuilder builder) {

		return builder.sources(TodoappApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

}
