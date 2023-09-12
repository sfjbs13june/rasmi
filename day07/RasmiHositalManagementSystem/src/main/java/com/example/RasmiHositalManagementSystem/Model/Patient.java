package com.example.RasmiHositalManagementSystem.Model;

import org.springframework.stereotype.Component;

@Component
public class Patient {

  private String pName;
  private int pId;
  private String hName;
  private String disease;


  public Patient(String pName, int pId, String hName, String disease) {
    this.pName = pName;
    this.pId = pId;
    this.hName = hName;
    this.disease = disease;
  }

  public String getpName() {
    return pName;
  }

  public void setpName(String pName) {
    this.pName = pName;
  }

  public int getpId() {
    return pId;
  }

  public void setpId(int pId) {
    this.pId = pId;
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

  public Patient() {
  }
}
