package com.example.rasmihospitalMongo.repository;

import com.example.rasmihospitalMongo.module.Hospital;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface HospitalRepo extends CrudRepository<Hospital,Integer> {
    public String saveHospital(Hospital hospital);
    public List<Hospital> getHospital(int hId);
    public Hospital updateHospital(Hospital hospital);
    public void deleteHospital(int hId);


}
