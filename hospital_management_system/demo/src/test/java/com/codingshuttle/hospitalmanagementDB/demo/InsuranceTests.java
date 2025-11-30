package com.codingshuttle.hospitalmanagementDB.demo;

import com.codingshuttle.hospitalmanagementDB.demo.entity.Appointment;
import com.codingshuttle.hospitalmanagementDB.demo.entity.Insurance;
import com.codingshuttle.hospitalmanagementDB.demo.service.AppointService;
import com.codingshuttle.hospitalmanagementDB.demo.service.InsuranceService;
import com.codingshuttle.hospitalmanagementDB.demo.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTests {

    @Autowired
    private InsuranceService insuranceService;
    @Autowired
    private AppointService appointService;
    @Autowired
    private PatientService patientService;
    @Test
    public void testAssignInsuranceToPatient(){

        Insurance insurance=Insurance.builder()
                        .provider("HDFC Ergo")
                        .validUntil(LocalDate.of(2030,1,1))
                        .policyNumber("POL123")
                        .build();
        var updatedInsurance=insuranceService.assignInsuranceToPatient(insurance,1L);
        System.out.println(updatedInsurance);

        patientService.deletePatient(1L);
    }
    @Test
    public void testCreateAppointment(){
        Appointment appointment=Appointment.builder()
                .appointmentTime(LocalDateTime.of(2025,11,1,14,0))
                .reason("Cancer")
                .build();

        var updatedAppointment=appointService.createNewAppointment(appointment,1L,2L);
        System.out.println(updatedAppointment);

        patientService.deletePatient(1L);
    }
}
