package com.api.aruba.arangodb;

import com.arangodb.ArangoDB;
import com.arangodb.springframework.annotation.EnableArangoRepositories;
import com.arangodb.springframework.config.ArangoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration implements ArangoConfiguration {
    @Override
    public ArangoDB.Builder arango() {
        return new ArangoDB.Builder().host("localhost", 8529).user("root").password("1");
    }

    @Override
    public String database() {
        return "spring-demo";
    }
}
