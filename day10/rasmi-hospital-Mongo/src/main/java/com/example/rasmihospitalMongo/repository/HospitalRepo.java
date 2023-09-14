package com.example.rasmihospitalMongo.repository;

import com.example.rasmihospitalMongo.module.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepo extends MongoRepository<Hospital,Integer> {



}
