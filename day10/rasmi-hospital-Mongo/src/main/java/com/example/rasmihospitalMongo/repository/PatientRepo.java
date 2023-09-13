package com.example.rasmihospitalMongo.repository;

import com.example.rasmihospitalMongo.module.Hospital;
import com.example.rasmihospitalMongo.module.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface PatientRepo extends MongoRepository<Patient,Integer> {
    public String savePatient(Patient patient);
    public List<Patient> getPatient();
    public Patient updatePatient(Patient patient);
    public void deletePatient(int pId);
}
