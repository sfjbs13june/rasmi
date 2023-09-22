package com.example.rasmiminiproject.controller;

import com.example.rasmiminiproject.model.Appointment;
import com.example.rasmiminiproject.model.Prescription;
import com.example.rasmiminiproject.repository.PrescriptionRepository;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

public class PrescriptionControllerTest {

    @InjectMocks
    private PrescriptionController prescriptionController;

    @Mock
    private PrescriptionRepository prescriptionRepositorytest;

    @Test
    public void savePrescriptionTest()
    {
        Prescription prescription=new Prescription();
        prescription.setPrescriptionId("id1");
        prescription.setAppointmentId("app1");
        prescription.setDescription("fever");
        prescription.setPatientName("pat1");
        prescription.setDoctorName("doctor1");
        when(prescriptionRepositorytest).saveAppointment(prescription).thenReturn(prescription);
        prescriptionController.savePrescription(prescription);


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
      when(prescriptionRepositorytest.getAllPrescriptions(anyString())).thenReturn(prescription);
        prescriptionController.savePrescription(prescription);
    }
    }

