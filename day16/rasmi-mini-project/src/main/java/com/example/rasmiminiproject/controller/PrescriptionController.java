package com.example.rasmiminiproject.controller;

import com.example.rasmiminiproject.model.Prescription;
import com.example.rasmiminiproject.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrescriptionController {

    private final PrescriptionRepository prescriptionrepo;

    @Autowired
    public PrescriptionController(PrescriptionRepository prescriptionrepo1) {
        this.prescriptionrepo = prescriptionrepo1;
    }



    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription)
    {
        return prescriptionrepo.save(prescription);
    }

    @GetMapping("/viewprescription")
    public List<Prescription> getAllPrescriptions(@RequestParam String patientName)
    {

        Prescription prescription= prescriptionrepo.findByPatientName(patientName);

        return (List<Prescription>) prescription;
    }

}
