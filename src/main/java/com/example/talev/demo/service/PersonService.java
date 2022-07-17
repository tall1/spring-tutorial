package com.example.talev.demo.service;

import com.example.talev.demo.Person.Person;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface PersonService {
     List<Person> getAll() throws SQLException;
     Person getPersonById(int id) throws SQLException;
     void insertPerson(String name, int age) throws SQLException;
     void updatePerson(int id, String name, int age) throws SQLException;
     void deletePerson(int id) throws SQLException;

}
