package com.spring.app.controller;

import com.spring.app.repository.Subject;
import com.spring.app.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/subject")
@CrossOrigin(origins = "http://localhost:4200")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value= "/id", method = RequestMethod.GET)
    public Optional<Subject> findById(@RequestParam("id") String id){
        return this.subjectService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Subject> findAll(){
        return this.subjectService.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Subject insert(@RequestParam("title") String title){
        return this.subjectService.insert(new Subject(new Long(this.findAll().size()) , title));
    }
}
