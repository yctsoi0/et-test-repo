package com.example.testrepo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("greeting")
public class GreetingProps {
	private String message;
}
