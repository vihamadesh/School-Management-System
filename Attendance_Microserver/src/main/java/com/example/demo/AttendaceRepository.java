package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.List;


@Repository
public interface AttendaceRepository extends MongoRepository<Attecdance, String> {
    public Attecdance findByFirstName(String firstName);
    public List<Attecdance> findByDate(Data data);
}