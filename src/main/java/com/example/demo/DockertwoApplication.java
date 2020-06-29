package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockertwoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DockertwoApplication.class);
	
	public static void main(String[] args) {
		logger.info("Application starting up");
		SpringApplication.run(DockertwoApplication.class, args);
	}

}
