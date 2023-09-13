package com.example.rasmihospitalMongo.controller;

import com.example.rasmihospitalMongo.module.Patient;
import com.example.rasmihospitalMongo.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    private PatientRepo prepo;

    public PatientController(PatientRepo prepo) {
        this.prepo = prepo;
    }

    @PostMapping("/savePatient")
    public String savePatient(@RequestBody Patient patient)
    {
        prepo.save(patient);
        return "saved";
    }

    @GetMapping("/getPatient")
    public List<Patient> getPatient()
    {
        List<Patient> p= (List<Patient>) prepo.findAll();
        return p;
    }

    @PutMapping("/updatePatient")
    public Patient updatePatient(@RequestBody Patient patient)
    {
        return prepo.save(patient);
    }

    @DeleteMapping("/deletePatient")
    public void deletePatient(@RequestParam int pId)
    {
        prepo.deleteById(pId);
    }

}
