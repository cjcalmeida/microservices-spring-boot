package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {

	private Logger log = LoggerFactory.getLogger(ConfigurationBinding.class);

	@Value("${configuration.projectName}")
	void setProjectName(String projectName) {
		log.info("Obtendo config via @Value('${configuration.projectName}')[{}]", projectName);
	}

	@Autowired
	void setEnviroment(Environment enviroment) {
		log.info("Obtendo config via Enviroment [{}]",
				enviroment.getProperty("configuration.projectName"));
	}

	@Autowired
	void setConfigurationProperties(ConfigurationBinding properties){
		log.info("Obtendo config via ConfigurationProperties [{}]",
				properties.getProjectName());
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



}

