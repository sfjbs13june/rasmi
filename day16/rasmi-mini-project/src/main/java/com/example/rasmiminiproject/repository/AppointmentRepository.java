package com.example.rasmiminiproject.repository;

import com.example.rasmiminiproject.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment,String> {
   public Appointment findBydoctorName(String doctorName);

    Appointment findByPatientName(String patientName);
}
