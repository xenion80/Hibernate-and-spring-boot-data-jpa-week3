package com.codingshuttle.hospitalmanagementDB.demo.repository;

import com.codingshuttle.hospitalmanagementDB.demo.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}