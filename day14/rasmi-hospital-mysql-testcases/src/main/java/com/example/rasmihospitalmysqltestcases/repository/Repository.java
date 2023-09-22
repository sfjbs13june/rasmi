package com.example.rasmihospitalmysqltestcases.repository;

import com.example.rasmihospitalmysqltestcases.model.Hospital;
import org.springframework.data.repository.CrudRepository;


@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Hospital,Integer> {
}
