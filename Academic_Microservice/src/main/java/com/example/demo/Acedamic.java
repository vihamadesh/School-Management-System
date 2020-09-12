package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Acedamic {

    String firstName;
    String subject;
    int  mark  ;

    public Acedamic(String firstName, String subject, int mark) {
        this.firstName = firstName;
        this.subject =subject;
        this.mark      = mark;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSubject() {
        return firstName;
    }

    public void setSubject(String lastName) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String toString() {
        return "Person First Name:"+firstName+" Subject:"+subject+" Mark:"+mark;
    }
}