package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AcedamicRepository extends MongoRepository<Acedamic, String> {
    public Acedamic findByFirstName(String firstName);
    public List<Acedamic> findByMark(int mark);
}