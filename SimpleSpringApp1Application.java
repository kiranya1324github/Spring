package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SimpleSpringApp1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(SimpleSpringApp1Application.class, args);
		Student sob=context.getBean(Student.class);
		System.out.println(sob);
		sob.display();

		
		
		
	}

}
