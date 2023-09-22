package com.example.rasmiminiproject.controller;

import com.example.rasmiminiproject.model.Appointment;
import com.example.rasmiminiproject.model.Prescription;
import com.example.rasmiminiproject.repository.AppointmentRepository;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class PatientControllerTest {
    @InjectMocks
   private PatientController patientController;

    @Mock
    private AppointmentRepository appointmentRepotest;

    @Mock
    private Appointment appointment;

    @Test
    public void getMyAppointmentsTest()
    {
        Appointment appointment=new Appointment();
        appointment.setAppointmentId("app1");
        appointment.setDoctorName("doctor1");
        appointment.setDate("22/09/2023");
        when(appointmentRepotest.save(appointment)).thenReturn(appointment);
        Appointment result=patientController.saveAppointment(appointment);
        assertEquals("id1",result.getAppointmentId());
        assertEquals("app1",result.getDoctorName());
        assertEquals("22/09/2023",result.getDate());

    }

}
