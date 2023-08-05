package com.htm;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClaimMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(ClaimMicroservice1Application.class, args);
	}

}
