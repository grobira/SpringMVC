package com.spring.app.controller;

import com.spring.app.repository.Person;
import com.spring.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> findAll(){
        return this.personService.findAll();
    }

    @RequestMapping(value= "/filterByAge", method = RequestMethod.GET)
    public List<Person> findByAgeGreaterThen(@RequestParam("age") String age){
        return this.personService.findByAgeGreaterThen(Integer.parseInt(age));
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Person insert(@RequestParam("name") String name,
                         @RequestParam("lastName") String lastName,
                         @RequestParam("age") String age){
        return this.personService.insert(new Person( new Long(this.findAll().size()), name, lastName, Integer.parseInt(age)));
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Person update(@RequestParam("id") String id,
                         @RequestParam("name") String name,
                         @RequestParam("lastName") String lastName,
                         @RequestParam("age") String age){
        this.deletebyId(id);
        return this.personService.insert(new Person( Long.parseLong(id) , name, lastName, Integer.parseInt(age)));
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public Optional<Person> findById(@RequestParam("id") String id){
        return this.personService.findById(Long.parseLong(id));
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deletebyId(@RequestParam("id") String id){
       this.personService.deleteById(Long.parseLong(id));
    }
}
