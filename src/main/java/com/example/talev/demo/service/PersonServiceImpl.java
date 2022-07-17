package com.example.talev.demo.service;
import com.example.talev.demo.Person.Person;
import com.example.talev.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements  PersonService{
    private PersonRepository personRepository;

    @PostConstruct
    public void init453534(){
        // here put any after construction operations
        System.out.println("@PostConstruct");
    }
    @PreDestroy
    public void  exitAll123(){
        System.out.println("@PreDestroy");
    }

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAll() throws SQLException {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonById(int id) throws SQLException {
        return personRepository.findById(id).get();
    }

    @Override
    public void insertPerson(String name, int age) throws SQLException {
        personRepository.save(new Person(0,name, age));
    }

    @Override
    public void updatePerson(int id, String name, int age) throws SQLException {
        personRepository.save(new Person(id, name, age));
    }

    @Override
    public void deletePerson(int id) throws SQLException {
        personRepository.deleteById(id);
    }
}
