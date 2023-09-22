package com.example.rasmiminiproject.controller;

import com.example.rasmiminiproject.model.Appointment;
import com.example.rasmiminiproject.model.Prescription;
import com.example.rasmiminiproject.repository.AppointmentRepository;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class PatientControllerTest {
    @InjectMocks
   private PatientController patientController;

    @Mock
    private AppointmentRepository appointmentRepo;

    @Test
    public void getMyAppointmentsTest()
    {
        Prescription prescription=new Prescription("pre1","app1","fever","pat1","doctor1");

        Appointment appointment= new Appointment("app1","pat1","doctor1","21/09/2023",prescription);


    }
    /*
     @Test
    public void getPatientTest(){
        Patient patient= new Patient("id1","pat01","hospital01","dis01");
        when(dataRepository.getPatient(anyString())).thenReturn(patient);
        Patient result= patientController.getPatient("pat01");

        assertEquals("id1",result.getId());
        assertEquals("pat01",result.getName());
        assertEquals("hospital01",result.getHospital());
        assertEquals("dis01",result.getDisease());
     */
}
