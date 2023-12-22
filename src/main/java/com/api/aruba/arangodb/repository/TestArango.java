package com.api.aruba.arangodb.repository;


import com.arangodb.springframework.core.ArangoOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.api.aruba.arangodb.collection.Character;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TestArango {

    @Autowired
    private ArangoOperations operations;
    @Autowired
    private CharacterRepository repository;

    public void test() throws Exception {
        // first drop the database so that we can run this multiple times with the same dataset
        operations.dropDatabase();

        // save a single entity in the database
        // there is no need of creating the collection first. This happen automatically
        final Character nedStark = new Character("Ned", "Stark", true, 41);
        repository.save(nedStark);
        // the generated id from the database is set in the original entity
        System.out.println(String.format("Ned Stark saved in the database with id: '%s'", nedStark.getId()));

        // lets take a look whether we can find Ned Stark in the database
        final Optional foundNed = repository.findById(nedStark.getId());
        assert foundNed.isPresent();
        System.out.println(String.format("Found %s", foundNed.get()));
    }
}
