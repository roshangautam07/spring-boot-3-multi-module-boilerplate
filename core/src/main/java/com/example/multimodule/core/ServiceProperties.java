package com.example.multimodule.core;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("core")
public class ServiceProperties {

	/**
	 * A message for the service.
	 */
	private String message;

	public String getMessage() {
		return "core application";
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
