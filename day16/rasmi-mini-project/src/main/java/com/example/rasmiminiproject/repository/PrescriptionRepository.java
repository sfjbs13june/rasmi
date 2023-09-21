package com.example.rasmiminiproject.repository;

import com.example.rasmiminiproject.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrescriptionRepository extends MongoRepository<Prescription,String> {
    Prescription findByPatientName(String patientName);
}
