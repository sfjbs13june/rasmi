package com.example.RasmiHositalManagementSystem.UnitTest;

import com.example.RasmiHositalManagementSystem.Controller.HospitalController;
import com.example.RasmiHositalManagementSystem.Model.Hospital;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class HospitalUnitTest {

    @InjectMocks
    HospitalController hospitalController=new HospitalController();

    @Test
    public void test_createHospital()
    {
        Hospital hospital=new Hospital("Kims",2,"Hyd");
        Hospital result= hospitalController.createHospital(hospital);
        assertEquals(hospital.gethName(),result.gethName());
        assertEquals(hospital.gethId(),result.gethId());
        assertEquals(hospital.getAddress(),result.getAddress());

    }

    @Test
    public void test_getHospital()
    {
        Hospital hospital=new Hospital("Nims",4,"Bnglr");
        hospitalController.createHospital(hospital);
        Hospital result=hospitalController.getHospital("Nims");
        assertEquals("Nims",result.gethName());
        assertEquals(4,result.gethId());
        assertEquals("Bnglr",result.getAddress());
    }

    @Test
    public void test_updateHospital()
    {
        Hospital hospital=new Hospital("Sims",6,"Chennai");
        hospitalController.createHospital(hospital);
        Hospital result=hospitalController.updateHospital("Sims","Kerala",7);
        assertEquals("Sims",result.gethName());
        assertEquals(7,result.gethId());
        assertEquals("Kerala",result.getAddress());
    }

    @Test
    public void test_deleteHospital()
    {
        Hospital hospital=new Hospital();
        hospital.sethName("Mims");
        hospital.sethId(9);
        hospital.setAddress("RJY");
        hospitalController.createHospital(hospital);
        hospitalController.deleteHospital("Mims");
        Hospital result=hospitalController.getHospital("Mims");
        assertNull(result);
    }
}
