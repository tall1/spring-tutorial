package com.example.talev.demo.repository;

import com.example.talev.demo.Person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
/*    List<Person> getAll() throws SQLException;
    Person getPersonById(int id) throws SQLException;
    void insertPerson(String name, int age) throws SQLException;
    void updatePerson(int id, String name, int age) throws SQLException;
    void deletePerson(int id) throws SQLException;*/
}
