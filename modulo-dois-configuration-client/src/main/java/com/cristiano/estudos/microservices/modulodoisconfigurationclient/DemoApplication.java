package com.cristiano.estudos.microservices.modulodoisconfigurationclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemoApplication {

	private Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	public void setEnviroment(Environment enviroment) {
		log.info("Valor recebido pelo config-server [{}]", enviroment.getProperty("configuration.projectName"));

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

