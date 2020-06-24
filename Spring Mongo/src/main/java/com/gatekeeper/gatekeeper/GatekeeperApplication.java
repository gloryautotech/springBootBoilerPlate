package com.gatekeeper.gatekeeper;

import com.gatekeeper.gatekeeper.service.MongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = {
		"com.gatekeeper.gatekeeper",
		"org.springframework.data.mongodb.core"
		})
public class GatekeeperApplication {

	public static void main(String[] args) {

		SpringApplication.run(GatekeeperApplication.class, args);
	}


}
