package com.example.rasmiminiproject.controller;

import com.example.rasmiminiproject.model.Prescription;
import com.example.rasmiminiproject.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrescriptionController {

    @Autowired
    private PrescriptionRepository prescriptionrepo;



    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription) {
        return prescriptionrepo.save(prescription);
    }

    @GetMapping("/viewprescription")
    public Prescription getAllPrescriptions(@RequestParam String patientName)
    {

        Prescription prescription= prescriptionrepo.findByPatientName(patientName);

        return prescription;
    }

}
