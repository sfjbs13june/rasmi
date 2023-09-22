package com.example.RasmiHositalManagementSystem.model;

public class Hospital {

    private String hName;
    private int hId;
    private String address;


    public Hospital(String hName, int hId, String address) {
        this.hName = hName;
        this.hId = hId;
        this.address = address;
    }

    public String gethName() {
        return hName;
    }

    public int gethId() {
        return hId;
    }

    public String getAddress() {
        return address;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public void sethId(int hId) {
        this.hId = hId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Hospital() {
    }
}
