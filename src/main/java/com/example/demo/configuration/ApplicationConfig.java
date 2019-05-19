package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.mongo.WidgetRepository;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
@EnableMongoRepositories(basePackageClasses = WidgetRepository.class)
public class ApplicationConfig extends AbstractMongoConfiguration {


	@Value("${mongo:#{null}}")
    private String mongo;

	@Override
	public MongoClient mongoClient() {
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://svc_microservice:" + mongo + "@socialmediadb-gpeio.mongodb.net/test?retryWrites=true");

		return new MongoClient(uri);
	}

	@Override
	protected String getDatabaseName() {
		return "widgetCollection";
	}
}
