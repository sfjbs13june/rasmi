package com.example.rasmiminiproject.controller;

import com.example.rasmiminiproject.model.Appointment;
import com.example.rasmiminiproject.model.Prescription;
import com.example.rasmiminiproject.repository.AppointmentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
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
        Prescription prescription=new Prescription();
        prescription.setPrescriptionId("id1");
        prescription.setAppointmentId("app1");
        prescription.setDescription("fever");
        prescription.setPatientName("pat1");
        prescription.setDoctorName("doctor1");

        Appointment appointment=new Appointment();
        appointment.setAppointmentId("app1");
        appointment.setDoctorName("doctor1");
        appointment.setDate("22/09/2023");
        appointment.setPrescription(prescription);
        when(appointmentRepotest.getAppointment("doctor1")).thenReturn(appointment);
        Appointment result= (Appointment) patientController.getMyAppointments("pat1");
        assertEquals("app1",result.getAppointmentId());
        assertEquals("doctor1",result.getDoctorName());
        assertEquals("22/09/2023",result.getDate());
        assertEquals(prescription,result.getPrescription());
    }
    public void saveAppointmentTest()
    {
        Appointment appointment=new Appointment();
        Prescription prescription=new Prescription();
        prescription.setPrescriptionId("id1");
        prescription.setAppointmentId("app1");
        prescription.setDescription("fever");
        prescription.setPatientName("pat1");
        prescription.setDoctorName("doctor1");
        appointment.setPrescription(prescription);

        appointment.setAppointmentId("app1");
        appointment.setDoctorName("doctor1");
        appointment.setDate("22/09/2023");
        when(appointmentRepotest.save(appointment)).thenReturn(appointment);
        Appointment result=patientController.saveAppointment(appointment);
        assertEquals("id1",result.getAppointmentId());
        assertEquals("app1",result.getDoctorName());
        assertEquals("22/09/2023",result.getDate());
        assertEquals(prescription,result.getPrescription());

    }



}
