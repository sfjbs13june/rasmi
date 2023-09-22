package com.example.rasmiminiproject.controller;

import com.example.rasmiminiproject.model.Appointment;
import com.example.rasmiminiproject.repository.AppointmentRepository;
import com.example.rasmiminiproject.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    private final AppointmentRepository appointmentrepo;

    @Autowired
    public PatientController(AppointmentRepository appointmentrepo) {
        this.appointmentrepo = appointmentrepo;
    }




    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment)
    {
        return appointmentrepo.save(appointment);
    }

        @GetMapping("/myappointment")
    public List<Appointment> getMyAppointments(@RequestParam String patientName)
        {
            Appointment app=appointmentrepo.findByPatientName(patientName);
            return (List<Appointment>) app;
        }




    /*


    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){

    }
     */
}
