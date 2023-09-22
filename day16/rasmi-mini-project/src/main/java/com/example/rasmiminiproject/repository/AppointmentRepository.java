package com.example.rasmiminiproject.repository;

import com.example.rasmiminiproject.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment,String> {

    Map<String, Appointment> appointmentMap= new HashMap<String,Appointment>();
   public Appointment findBydoctorName(String doctorName);

    Appointment findByPatientName(String patientName);

    public Appointment getAppointment(String doctorName);

   Appointment saveAppointment(Appointment appointment);

}
