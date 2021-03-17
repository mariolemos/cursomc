package com.mariolemos.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mariolemos.cursomc.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;	

	@Bean
	public boolean instantiateDatabase() throws Exception {
		dbService.instantiateDatabase() ;			
		return true;
	}

}
