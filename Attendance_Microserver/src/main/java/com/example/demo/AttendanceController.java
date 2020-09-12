package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
public class  AttendanceController{

    @Autowired
    private AttendanceService attecdanceService;

    @RequestMapping("/create")
    public String create(@RequestParam String firstName, @RequestParam String status, @RequestParam Data date) {
        Attecdance p = attecdanceService.create(firstName, status,date);
        return p.toString();
    }

    @RequestMapping("/get")
    public Attecdance getPerson(@RequestParam String firstName) {
        return attecdanceService.getByFirstName(firstName);
    }
    @RequestMapping("/getAll")
    public List<Attecdance> getAll(){
        return attecdanceService.getAll();
    }
    @RequestMapping("/update")
    public String update(@RequestParam String firstName, @RequestParam String status, @RequestParam Data date) {
        Attecdance p = attecdanceService.update(firstName,status , date);
        return p.toString();
    }
    @RequestMapping("/delete")
    public String delete(@RequestParam String firstName) {
        attecdanceService.delete(firstName);
        return "Deleted "+firstName;
    }
    @RequestMapping ("/deleteAll")
    public String deleteAll() {
        attecdanceService.deleteAll();
        return "Deleted all records";
    }

}