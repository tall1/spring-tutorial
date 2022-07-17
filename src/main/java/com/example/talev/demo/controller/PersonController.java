package com.example.talev.demo.controller;

import com.example.talev.demo.Person.Person;
import com.example.talev.demo.service.PersonService;
import com.example.talev.demo.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/person")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public List<Person> getAll() throws SQLException {
        return this.personService.getAll();
    }

//    localhost:8080/api/v1/person/get1/5
    @GetMapping("/get1/{id}")
    public Person getPersonById1(@PathVariable int id) throws SQLException {
        return personService.getPersonById(id);
    }

//    http://localhost:8080/api/v1/person/get2?id=5
    @GetMapping("/get2")
    public Person getPersonById2(int id) throws SQLException {
        return personService.getPersonById(id);
    }

    @PostMapping
    public void insertPerson(Person p) throws SQLException {
        personService.insertPerson(p.getName(), p.getAge());
    }

    @PutMapping
    public void updatePerson(Person p) throws SQLException {
        personService.updatePerson(p.getId(), p.getName(), p.getAge());
    }

    @DeleteMapping
    public void deletePerson(int id) throws SQLException {
        personService.deletePerson(id);
    }
}
