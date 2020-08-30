package com.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalConfigurationController {

	@Value("${api-gateway.url}")
	String apiGatewayUrl;
	
	@GetMapping("/api-gateway-url")
	public String getApiGatewayUrl() {
		return apiGatewayUrl;
	}
	
}
