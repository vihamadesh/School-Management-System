package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class  AcedamicController{

    @Autowired
    private AcedamicService personService;

    @RequestMapping("/create")
    public String create(@RequestParam String firstName, @RequestParam String subject, @RequestParam int mark) {
        Acedamic p = personService.create(firstName, subject, mark);
        return p.toString();
    }

    @RequestMapping("/get")
    public Acedamic getPerson(@RequestParam String firstName) {
        return personService.getByFirstName(firstName);
    }
    @RequestMapping("/getAll")
    public List<Acedamic> getAll(){
        return personService.getAll();
    }
    @RequestMapping("/update")
    public String update(@RequestParam String firstName, @RequestParam String subject, @RequestParam int mark) {
        Acedamic p = personService.update(firstName, subject, mark);
        return p.toString();
    }
    @RequestMapping("/delete")
    public String delete(@RequestParam String firstName) {
        personService.delete(firstName);
        return "Deleted "+firstName;
    }
    @RequestMapping ("/deleteAll")
    public String deleteAll() {
        personService.deleteAll();
        return "Deleted all records";
    }

}