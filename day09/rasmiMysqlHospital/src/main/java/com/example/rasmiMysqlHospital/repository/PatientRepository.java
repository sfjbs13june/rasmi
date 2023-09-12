package com.example.rasmiMysqlHospital.repository;

import com.example.rasmiMysqlHospital.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient,Integer> {
}
