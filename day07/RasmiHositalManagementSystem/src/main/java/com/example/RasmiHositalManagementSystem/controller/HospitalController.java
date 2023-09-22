package com.example.RasmiHositalManagementSystem.controller;

import com.example.RasmiHositalManagementSystem.model.Hospital;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HospitalController {

    Map<String,Hospital> hospitalMap=new HashMap<String,Hospital>();

    @GetMapping("/getHospital")
    public Hospital getHospital(@RequestParam String hName)
    {
        return hospitalMap.get(hName);
    }

    @PostMapping("/createHospital")
    public Hospital createHospital(@RequestBody Hospital hospital)
    {
        hospitalMap.put(hospital.gethName(),hospital);
        return hospital;
    }

    @PutMapping("/updateHospital")
    public Hospital updateHospital(@RequestParam String hName,@RequestParam String address, @RequestParam int hId)
    {
        Hospital hospital=hospitalMap.get(hName);
        hospital.sethId(hId);
        hospital.setAddress(address);
        hospitalMap.put(hName,hospital);
        return hospital;
    }

    @DeleteMapping("/deleteHospital")
    public void deleteHospital(@RequestParam String hName)
    {
        hospitalMap.remove(hName);
    }

}
