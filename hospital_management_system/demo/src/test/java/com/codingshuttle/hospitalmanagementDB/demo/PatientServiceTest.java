package com.codingshuttle.hospitalmanagementDB.demo;

import com.codingshuttle.hospitalmanagementDB.demo.dto.BloodGroupStats;
import com.codingshuttle.hospitalmanagementDB.demo.dto.CPatientInfo;
import com.codingshuttle.hospitalmanagementDB.demo.dto.PatientIndfo;
import com.codingshuttle.hospitalmanagementDB.demo.entity.Patient;
import com.codingshuttle.hospitalmanagementDB.demo.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {
    @Autowired
    private PatientRepository patientRepository;
    @Test
    public void testPatient(){
//        List<Patient> patientList =patientRepository.findAll();
//        List<PatientIndfo> patientList =patientRepository.getAllPatientIndfo();
//        List<CPatientInfo> patientList =patientRepository.getAllPatientInfoConcrete();
//        List<BloodGroupStats> patientList =patientRepository.getBloodStats();
//
//        for(var p: patientList){
//            System.out.println(p);
//        }
        int rowsAffected=patientRepository.updatePatientNameWithId("Karan Sardar", 31L);

    }
}
