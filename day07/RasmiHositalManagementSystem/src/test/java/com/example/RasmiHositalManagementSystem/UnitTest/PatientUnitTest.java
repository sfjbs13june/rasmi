package com.example.RasmiHositalManagementSystem.UnitTest;

import com.example.RasmiHositalManagementSystem.Controller.PatientController;
import com.example.RasmiHositalManagementSystem.Model.Patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;


@RunWith(MockitoJUnitRunner.class)
public class PatientUnitTest {

    @InjectMocks
    PatientController patientController=new PatientController();

    @Test
    public void test_createPatient()
    {
        Patient patient=new Patient("Raju",1,"Kims","Cardiology");
        Patient result=patientController.createPatient(patient);

        assertEquals(patient.getpName(),result.getpName());
        assertEquals(patient.getpId(),result.getpId());
        assertEquals(patient.gethName(),result.gethName());
        assertEquals(patient.getDisease(),result.getDisease());
    }

    @Test
    public void test_getPatient()
    {
        Patient patient=new Patient("Renu",1,"Nims","Gynacology");
        PatientController.createPatient(patient);
        Patient result=patientController.getPatient("Renu");
        assertEquals("Renu",result.getpName());
        assertEquals(1,result.getpId());
        assertEquals("Nims",result.gethName());
        assertEquals("Gynacology",result.getDisease());
    }

    @Test
    public void test_updatePatient()
    {
        Patient patient=new Patient("Revathi",5,"Rims","Skin");
        PatientController.createPatient(patient);
        Patient result=patientController.updatePatient("Revathi",15,"Sims","Hand");
        assertEquals("Revathi",result.getpName());
        assertEquals("Sims",result.gethName());
        assertEquals(15,result.getpId());
        assertEquals("Hand",result.getDisease());

    }

    @Test
    public void test_deleteStudent()
    {
        Patient patient=new Patient();
        patient.setpName("Revathi");
        patient.setpId(15);
        patient.sethName("Sims");
        patient.setDisease("Hand");

        PatientController.createPatient(patient);
        patientController.deletePatient("Revathi");
        Patient result=patientController.getPatient("Revathi");
        assertNull(result);
    }

}
