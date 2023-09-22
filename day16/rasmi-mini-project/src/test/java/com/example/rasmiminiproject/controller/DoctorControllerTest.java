package com.example.rasmiminiproject.controller;

import com.example.rasmiminiproject.model.Appointment;
import com.example.rasmiminiproject.model.Prescription;
import com.example.rasmiminiproject.repository.AppointmentRepository;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

public class DoctorControllerTest {

@InjectMocks
    private DoctorController doctorController;

@Mock
    private AppointmentRepository appointmentRepo;

@Test
    public void saveAppointmentTest()
{
    Prescription prescription=new Prescription();
prescription.setPrescriptionId("id1");
prescription.setAppointmentId("app1");
prescription.setDescription("fever");
prescription.setPatientName("pat1");
prescription.setDoctorName("doctor1");
    Appointment appointment=new Appointment("app1","pat1","doctor1","21/09/2023",prescription);
   appointment.setAppointmentId("app1");
   appointment.setPatientName("pat1");
   appointment.setDoctorName("doctor1");
   appointment.setDate("21/09/2023");
   appointment.setPrescription(prescription);

    when(appointmentRepo.saveAppointment(appointment)).thenReturn(appointment);
    Appointment result= doctorController.saveAppointment(appointment);
    assertEquals("app1",result.getAppointmentId());
    assertEquals("pat1",result.getPatientName());
    assertEquals("doctor1",result.getDoctorName());
    assertEquals("21/09/2023",result.getDate());
    assertEquals(prescription,result.getPrescription());

}

    @Test
    public void getAppointmentTest(){
        Prescription prescription=new Prescription("pre1","app1","fever","pat1","doctor1");

        Appointment appointment=new Appointment("app1","pat1","doctor1","21/09/2023",prescription);
        when(appointmentRepo.findBydoctorName(anyString())).thenReturn(appointment);
        Appointment result= (Appointment) doctorController.getAppointments("doctor1");

        assertEquals("app1",result.getAppointmentId());
        assertEquals("pat1",result.getPatientName());
        assertEquals("doctor1",result.getDoctorName());
        assertEquals("21/09/2023",result.getDate());
        assertEquals(prescription,result.getPrescription());

    }

}
