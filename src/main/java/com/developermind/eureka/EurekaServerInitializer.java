package com.developermind.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerInitializer.class, args);
	}

}
