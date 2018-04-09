package com.spring.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface SubjectRepository extends MongoRepository<Subject, Integer> {
}
