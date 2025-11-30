package com.codingshuttle.hospitalmanagementDB.demo.service;

import com.codingshuttle.hospitalmanagementDB.demo.entity.Appointment;
import com.codingshuttle.hospitalmanagementDB.demo.entity.Doctor;
import com.codingshuttle.hospitalmanagementDB.demo.entity.Patient;
import com.codingshuttle.hospitalmanagementDB.demo.repository.AppointmentRepository;
import com.codingshuttle.hospitalmanagementDB.demo.repository.DoctorRepository;
import com.codingshuttle.hospitalmanagementDB.demo.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createNewAppointment(Appointment appointment,Long patientId,Long doctorId){
        Patient patient=patientRepository.findById(patientId).orElseThrow();
        Doctor doctor=doctorRepository.findById(doctorId).orElseThrow();

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        appointmentRepository.save(appointment);
        return appointment;
    }
}
