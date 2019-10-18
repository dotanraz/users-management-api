package com.app;

import com.app.environment.YAMLConfig;
import com.app.testData.RandomDataUserInjection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan()
public class Main implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	@Autowired
	YAMLConfig yamlConfig;


	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Main.class);
		app.run();
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("using environment: " + yamlConfig.getEnvironment());
		logger.info("name: " + yamlConfig.getName());
		logger.info("postgres path: " + yamlConfig.getPostgresPath());
		logger.info("postgres user: " + yamlConfig.getPostgresUser());
		logger.info("postgres password: " + yamlConfig.getPostgresPassword());
	}
}
