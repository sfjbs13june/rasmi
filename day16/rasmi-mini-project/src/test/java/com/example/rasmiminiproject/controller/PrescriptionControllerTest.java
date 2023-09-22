package com.example.rasmiminiproject.controller;

import com.example.rasmiminiproject.model.Appointment;
import com.example.rasmiminiproject.model.Prescription;
import com.example.rasmiminiproject.repository.PrescriptionRepository;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

public class PrescriptionControllerTest {

    @InjectMocks
    private PrescriptionController prescriptionController;

    @Mock
    private PrescriptionRepository prescriptionRepository;

    @Mock
    private Prescription prescription;

    @Test
    public void savePrescriptionTest()
    {
        Prescription prescription=new Prescription();
        prescription.setPrescriptionId("id1");
        prescription.setAppointmentId("app1");
        prescription.setDescription("fever");
        prescription.setPatientName("pat1");
        prescription.setDoctorName("doctor1");
       when(prescriptionRepository.save(prescription)).thenReturn(prescription);
       Prescription result=prescriptionController.savePrescription(prescription);
       assertEquals("id1",result.getPrescriptionId());
       assertEquals("app1",result.getAppointmentId());
       assertEquals("fever",result.getDescription());
       assertEquals("pat1", result.getPatientName());
       assertEquals("doctor1",result.getDoctorName());
    }

    @Test
    public void getAllPrescriptionsTest()
    {
        Prescription prescription=new Prescription();
        prescription.setPrescriptionId("id1");
        prescription.setAppointmentId("app1");
        prescription.setDescription("fever");
        prescription.setPatientName("pat1");
        prescription.setDoctorName("doctor1");
      when(prescriptionRepository.findByPatientName("pat1")).thenReturn(prescription);
      Prescription result=prescriptionController.getAllPrescriptions("pat1");
        assertEquals("id1",result.getPrescriptionId());
        assertEquals("app1",result.getAppointmentId());
        assertEquals("fever",result.getDescription());
        assertEquals("pat1", result.getPatientName());
        assertEquals("doctor1",result.getDoctorName());
    }
    }

