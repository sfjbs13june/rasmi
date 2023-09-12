package com.example.RasmiHositalManagementSystem.Controller;

import com.example.RasmiHositalManagementSystem.Model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PatientController {

    static Map<String,Patient> patientMap=new HashMap<String, Patient>();

    @GetMapping("/getPatient")
    public Patient getPatient(@RequestParam String pName)
    {
        return patientMap.get(pName);
    }
    @PostMapping("/createPatient")
    public static Patient createPatient(@RequestBody Patient patient)
    {
        patientMap.put(patient.getpName(),patient);
        return patient;
    }
    @PutMapping("/updatePatient")
    public Patient updatePatient(@RequestParam String pName, @RequestParam int pId, @RequestParam String hName, @RequestParam String disease)
    {
        Patient patient=patientMap.get(pName);
        patient.setpId(pId);
        patient.sethName(hName);
        patient.setDisease(disease);
        return patient;
    }

    @DeleteMapping("/deletePatient")
    public void deletePatient(@RequestParam String pName)
    {
        patientMap.remove(pName);
    }
}
