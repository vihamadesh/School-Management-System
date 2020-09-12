
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Service
public class AttendanceService implements CommandLineRunner {

    @Autowired
    private AttendaceRepository attendanceRepository;

    //Create operation
    @Override
    public void run(String... args) throws Exception {

    }
    public Attecdance create(String firstName, String status, Data date) {
        return attendanceRepository.save(new Attecdance(firstName, status, (Date) date));
    }
    //Retrieve operation
    public List<Attecdance> getAll(){
        return attendanceRepository.findAll();
    }
    public Attecdance getByFirstName(String firstName) {
        return attendanceRepository.findByFirstName(firstName);
    }
    //Update operation
    public Attecdance update(String firstName, String status, Data data) {
        Attecdance p = attendanceRepository.findByFirstName(firstName);
        p.setStatus(status);
        p.setDate((Date) data);
        return attendanceRepository.save(p);
    }
    //Delete operation
    public void deleteAll() {
        attendanceRepository.deleteAll();
    }
    public void delete(String firstName) {
        Attecdance p = attendanceRepository.findByFirstName(firstName);
        attendanceRepository.delete(p);
    }


}