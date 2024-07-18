package com.infosys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class MicroContactsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroContactsApplication.class, args);
	}

}
