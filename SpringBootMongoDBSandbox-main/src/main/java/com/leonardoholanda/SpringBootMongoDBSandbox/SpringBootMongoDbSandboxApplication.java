package com.leonardoholanda.SpringBootMongoDBSandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan("com.leonardoholanda")
public class SpringBootMongoDbSandboxApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoDbSandboxApplication.class, args);
	}
	
}
