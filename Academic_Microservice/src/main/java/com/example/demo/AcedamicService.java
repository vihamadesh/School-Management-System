package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AcedamicService implements CommandLineRunner {

    @Autowired
    private AcedamicRepository acedamicRepository;

    //Create operation
    @Override
    public void run(String... args) throws Exception {

    }
    public Acedamic create(String firstName,String subject, int mark) {
        return acedamicRepository.save(new Acedamic(firstName, subject, mark));
    }
    //Retrieve operation
    public List<Acedamic> getAll(){
        return acedamicRepository.findAll();
    }
    public Acedamic getByFirstName(String firstName) {
        return acedamicRepository.findByFirstName(firstName);
    }
    //Update operation
    public Acedamic update(String firstName, String subject, int mark) {
        Acedamic p = acedamicRepository.findByFirstName(firstName);
        p.setSubject(subject);
        p.setMark(mark);
        return acedamicRepository.save(p);
    }
    //Delete operation
    public void deleteAll() {
        acedamicRepository.deleteAll();
    }
    public void delete(String firstName) {
        Acedamic p = acedamicRepository.findByFirstName(firstName);
        acedamicRepository.delete(p);
    }


}