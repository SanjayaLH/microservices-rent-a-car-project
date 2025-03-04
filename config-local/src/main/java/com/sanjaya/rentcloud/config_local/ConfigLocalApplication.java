package com.sanjaya.rentcloud.config_local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigLocalApplication.class, args);
	}

}
