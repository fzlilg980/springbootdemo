package com.xh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({})
public class ShdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShdemoApplication.class, args);
	}
}
