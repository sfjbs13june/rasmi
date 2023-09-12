package com.example.rasmiMysqlHospital.controller;

import com.example.rasmiMysqlHospital.model.Hospital;
import com.example.rasmiMysqlHospital.model.Patient;
import com.example.rasmiMysqlHospital.repository.HospitalRepository;
import com.example.rasmiMysqlHospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HospitalController {


    @Autowired
    private HospitalRepository hrepo;

    @PostMapping("/saveHospital")
    public String saveHospital(@RequestBody Hospital hospital)
    {
        hrepo.save(hospital);
        return "saved";
    }

    @GetMapping("/getHospital")
    public List<Hospital> getHospital()
    {
        List<Hospital> h= (List<Hospital>) hrepo.findAll();
        return h;
    }

    @PutMapping("/updateHospital")
    public Hospital updateHospital(@RequestBody Hospital hospital)
    {
        return hrepo.save(hospital);
    }

    @DeleteMapping("/deleteHospital")
    public void deleteHospital(@RequestParam int hId)
    {
        hrepo.deleteById(hId);
    }

}
