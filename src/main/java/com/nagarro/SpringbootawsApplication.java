package com.nagarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootawsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootawsApplication.class, args);
		System.out.println("CODE IS RUNNING ON Microsoft Azure VM");
	}

}
