package com.spring.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, Long> {

    @Query("{age : {$gt : ?0}}")
    public List<Person> findByAgeGreaterThen(int age);
}
