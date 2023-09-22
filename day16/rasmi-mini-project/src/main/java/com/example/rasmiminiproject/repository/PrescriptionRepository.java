package com.example.rasmiminiproject.repository;

import com.example.rasmiminiproject.model.Appointment;
import com.example.rasmiminiproject.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.HashMap;
import java.util.Map;

public interface PrescriptionRepository extends MongoRepository<Prescription,String> {
  //  Map<String, Prescription> appointmentMap= new HashMap<String,Prescription>();
    public void findByPatientName(String patientName);


}
