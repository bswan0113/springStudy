package com.example.demo;

import com.example.demo.chapter03.used.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args).getBean(DemoApplication.class).execute();
	}

	@Autowired
	Greeting greet;
	private void execute(){
		greet.greeting();
	}
}
