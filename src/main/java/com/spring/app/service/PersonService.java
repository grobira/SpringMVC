package com.spring.app.service;

import com.spring.app.repository.PersonRepository;
import com.spring.app.repository.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll(){
        return (List<Person>) this.personRepository.findAll();
    }

    public Person insert(Person u){
        return this.personRepository.save(u);
    }

    public Optional<Person> findById(long l) {
        return this.personRepository.findById(l);
    }

    public void deleteById(long l) {
        this.personRepository.deleteById(l);
    }
}
