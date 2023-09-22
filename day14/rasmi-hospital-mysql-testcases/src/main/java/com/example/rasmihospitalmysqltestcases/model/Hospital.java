package com.example.rasmihospitalmysqltestcases.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;



public class Hospital {


    private int id;
    private String name;

    public Hospital(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hospital() {
    }
}
