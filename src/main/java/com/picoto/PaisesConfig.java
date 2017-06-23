package com.picoto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableWebMvc  
@EnableMongoRepositories
@ComponentScan("com.picoto") 
public class PaisesConfig  extends AbstractMongoConfiguration {

	@Override
	public String getDatabaseName() {
		return "test";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient("mongohost");
	}
}