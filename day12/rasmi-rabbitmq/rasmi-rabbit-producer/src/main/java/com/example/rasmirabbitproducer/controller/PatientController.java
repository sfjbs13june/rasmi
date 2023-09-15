package com.example.rasmirabbitproducer.controller;

import com.example.rasmirabbitproducer.model.Hospital;
import com.example.rasmirabbitproducer.model.Patient;
import com.example.rasmirabbitproducer.service.RabbitMQSender;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    RabbitMQSender rabbitMQSender;

    @GetMapping(value = "/producer")
    public String producerPatient(@RequestParam("pId") int pId, @RequestParam("pName") String pName, @RequestParam String disease) {

        Patient patient=new Patient();
        patient.setpId(pId);
        patient.setpName(pName);
        patient.setAddress(disease);
        rabbitMQSender.sendPatient(patient);

        return "Patient Message sent to the RabbitMQ  Successfully";
    }

    @PostMapping(value = "/savepatient")
    public String postPatient(@RequestBody Patient patient) {
        rabbitMQSender.sendPatient(patient);
        return "Patient Message sent to the RabbitMQ  Successfully";
    }
}
