package com.example.rasmihospitalmysqltestcases.repository;

import com.example.rasmihospitalmysqltestcases.model.Hospital;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Hospital,Integer> {
}
