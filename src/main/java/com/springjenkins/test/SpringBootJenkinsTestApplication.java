package com.springjenkins.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsTestApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsTestApplication.class);

	public void message() {

		logger.info("Application Strarted");
	}

	public static void main(String[] args) {

		logger.info("Application Started");
		SpringApplication.run(SpringBootJenkinsTestApplication.class, args);
	}

}
