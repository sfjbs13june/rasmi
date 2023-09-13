package com.example.rasmihospitalMongo.repository;

import com.example.rasmihospitalMongo.module.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface HospitalRepo extends MongoRepository<Hospital,Integer> {
    public String saveHospital(Hospital hospital);
    public List<Hospital> getHospital();
    public Hospital updateHospital(Hospital hospital);
    public void deleteHospital(int hId);


}
