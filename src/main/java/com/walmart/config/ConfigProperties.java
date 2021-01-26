package com.walmart.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;



@Validated
@Configuration
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "service.config")
public class ConfigProperties {

	private String companyImplementation;
	
	public String getCompanyImplementation() {
		return companyImplementation;
	}

	public void setCompanyImplementation(String companyImplementation) {
		this.companyImplementation = companyImplementation;
	}

}