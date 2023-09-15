package com.example.rasmirabbitproducer.controller;

import com.example.rasmirabbitproducer.model.Hospital;
import com.example.rasmirabbitproducer.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    RabbitMQSender rabbitMQSender;

    @GetMapping(value = "/producer")
    public String producerHospital(@RequestParam("hId") int hId, @RequestParam("hName") String hName, @RequestParam String address) {

        Hospital hospital=new Hospital();
        hospital.sethId(hId);
        hospital.sethName(hName);
        hospital.setAddress(address);
        rabbitMQSender.sendHospital(hospital);

        return "Hospital Message sent to the RabbitMQ  Successfully";
    }

    @PostMapping(value = "/savehospital")
    public String postHospital(@RequestBody Hospital hospital) {
        rabbitMQSender.sendHospital(hospital);
        return "Hospital Message sent to the RabbitMQ  Successfully";
    }
}
