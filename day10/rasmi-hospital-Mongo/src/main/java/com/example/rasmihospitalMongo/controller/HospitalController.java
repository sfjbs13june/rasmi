package com.example.rasmihospitalMongo.controller;

import com.example.rasmihospitalMongo.module.Hospital;
import com.example.rasmihospitalMongo.repository.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HospitalController {


        private HospitalRepo hrepo;

    public HospitalController(HospitalRepo hrepo) {
        this.hrepo = hrepo;
    }

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


