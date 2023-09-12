package com.example.rasmiMysqlHospital.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {

    @Id
    private int pId;
    private String pName;
    private String hName;
    private String disease;

    public Patient(int pId, String pName, String hName, String disease) {
        this.pId = pId;
        this.pName = pName;
        this.hName = hName;
        this.disease = disease;
    }

    public Patient() {
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
