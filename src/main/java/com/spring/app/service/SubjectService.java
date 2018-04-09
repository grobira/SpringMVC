package com.spring.app.service;

import com.spring.app.repository.Subject;
import com.spring.app.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> findAll(){
        return this.subjectRepository.findAll();
    }

    public Subject insert(Subject s){
        return this.subjectRepository.save(s);
    }
}
