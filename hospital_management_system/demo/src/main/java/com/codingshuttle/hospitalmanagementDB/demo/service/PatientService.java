package com.codingshuttle.hospitalmanagementDB.demo.service;

import com.codingshuttle.hospitalmanagementDB.demo.entity.Patient;
import com.codingshuttle.hospitalmanagementDB.demo.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    @Transactional
    public void testPatientTransaction(){
        Patient p1= patientRepository.findById(1L).orElseThrow();
        Patient p2= patientRepository.findById(1L).orElseThrow();
        System.out.println(p1+" "+p2);
        System.out.println(p1==p2);
        p1.setName("karan");

    }
}
