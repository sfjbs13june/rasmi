package com.example.rasmiMysqlHospital.repository;

import com.example.rasmiMysqlHospital.model.Hospital;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital,Integer> {
}
