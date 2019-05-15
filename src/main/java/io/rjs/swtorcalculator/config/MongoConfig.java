package io.rjs.swtorcalculator.config;

import java.io.IOException;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;
import cz.jirutka.spring.embedmongo.EmbeddedMongoFactoryBean;

@Configuration
@ConfigurationProperties(prefix = "mongodb")
public class MongoConfig
{
	private String url;
	private String name;

	public MongoConfig() {
	}

	@Bean
	public MongoTemplate mongoTemplate() throws IOException {
		EmbeddedMongoFactoryBean mongo = new EmbeddedMongoFactoryBean();
		mongo.setBindIp(url);
		MongoClient mongoClient = mongo.getObject();

		if (mongoClient == null) {
			throw new IOException("MongoClient instance failed to initialize.");
		}

		return new MongoTemplate(mongoClient, name);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
