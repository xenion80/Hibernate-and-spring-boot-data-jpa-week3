package com.codingshuttle.hospitalmanagementDB.demo.service;

import com.codingshuttle.hospitalmanagementDB.demo.entity.Insurance;
import com.codingshuttle.hospitalmanagementDB.demo.entity.Patient;
import com.codingshuttle.hospitalmanagementDB.demo.repository.InsuranceRepository;
import com.codingshuttle.hospitalmanagementDB.demo.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Insurance assignInsuranceToPatient(Insurance insurance,Long patientId){
        Patient patient=patientRepository.findById(patientId).orElseThrow();

        patient.setInsurance(insurance);//dirty patient
        insurance.setPatient(patient);

        return insurance;
    }


}
