package com.example.rasmiMysqlHospital.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
    @Id
    private int hId;
    private String hName;
    private String address;

    public Hospital(int hId, String hName, String address) {
        this.hId = hId;
        this.hName = hName;
        this.address = address;
    }

    public Hospital() {
    }

    public int gethId() {
        return hId;
    }

    public void sethId(int hId) {
        this.hId = hId;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
