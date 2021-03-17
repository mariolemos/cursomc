package com.mariolemos.cursomc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mariolemos.cursomc.services.DBService;

@Configuration
@Profile("dev")
public class DevConfig {
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;	
	
	@Autowired
	private DBService dbService;	

	@Bean
	public boolean instantiateDatabase() throws Exception {
		if (!"create".equals(strategy)) {
			return false;
		}
		dbService.instantiateDatabase() ;			
		return true;
	}

}
