package com.faros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OcrUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcrUserApplication.class, args);
	}
}
