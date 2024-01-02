package com.api.aruba;

import com.api.aruba.arangodb.repository.TestArango;
import com.arangodb.springframework.annotation.EnableArangoRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableArangoRepositories(basePackages = {"com.api.aruba.arangodb"})
public class ArubaApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArubaApplication.class, args);
	}

}
