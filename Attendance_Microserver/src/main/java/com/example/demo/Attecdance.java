package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document
public class Attecdance{

    String firstName;
    String status;
    Date date ;

    public Attecdance(String firstName, String status,Date date) {
        this.firstName = firstName;
        this.date =date;
        this.status = status;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status =status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return "Person First Name:"+firstName+" Status:"+status+" Date:"+date;
    }
}