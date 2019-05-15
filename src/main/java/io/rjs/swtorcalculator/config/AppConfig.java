package io.rjs.swtorcalculator.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "io.rjs.swtorcalculator")
public class AppConfig {
	private String swtorVersion;

	public AppConfig() {
	}

	public String getSwtorVersion() {
		return swtorVersion;
	}

	public void setSwtorVersion(String swtorVersion) {
		this.swtorVersion = swtorVersion;
	}
}
