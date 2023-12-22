package com.api.aruba;

import com.api.aruba.arangodb.repository.TestArango;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArubaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringApplication.class, args);
	}

}
