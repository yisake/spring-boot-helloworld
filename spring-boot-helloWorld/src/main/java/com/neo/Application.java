package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableScheduling
public class Application {
	final static Logger logger = LoggerFactory.getLogger("MyApp.class");
	
	public static void main(String[] args) {
		logger.trace("trace");
		logger.debug("debug str");
		logger.info("info str");
		logger.warn("warn");
		logger.error("error");		
		SpringApplication.run(Application.class, args);
	}
}