package com.kiran.resttemplate.resttemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableEurekaClient
public class ResttemplateApplication {
	public static Logger logger = LoggerFactory.getLogger(ResttemplateApplication.class);
	@PostConstruct
	public void init(){
		logger.info("Initializing ....");

	}
	public static void main(String[] args) {
		logger.info("Application executed ....");
		SpringApplication.run(ResttemplateApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
