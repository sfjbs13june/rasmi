package com.example.rasmihospitalmysqltestcases.controller;

import com.example.rasmihospitalmysqltestcases.model.Hospital;
import com.example.rasmihospitalmysqltestcases.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HospitalController {

    @Autowired
    public Repository repo;

    @PostMapping("/create")
    public Hospital create(@RequestBody Hospital hospital) {
        return repo.save(hospital);
    }

    @GetMapping("/get")
    public List<Hospital> get(@RequestParam int id) {
        List<Hospital> h = (List<Hospital>) repo.findAll();
        return h;
    }

    @PutMapping("/update")
    public Hospital update(@RequestBody Hospital hospital) {
        return repo.save(hospital);

    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody int id)
    {
        repo.deleteById(id);
    }
}


