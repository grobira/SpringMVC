package com.spring.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, Long> {
}
