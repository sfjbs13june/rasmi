package com.example.rasmiminiproject.controller;

import com.example.rasmiminiproject.model.Appointment;
import com.example.rasmiminiproject.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    AppointmentRepository appointmentrepo;

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment)
    {
        return appointmentrepo.save(appointment);
    }
    @GetMapping("/doctorappointment")
    public List<Appointment> getAppointments(@RequestParam String doctorName)
    {
        Appointment app=appointmentrepo.findBydoctorName(doctorName);
        return (List<Appointment>) app;
    }


}
