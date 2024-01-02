package com.api.aruba.arangodb.repository;

import com.api.aruba.arangodb.collection.Character;
import com.arangodb.springframework.repository.ArangoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends ArangoRepository<Character, String>{

}
