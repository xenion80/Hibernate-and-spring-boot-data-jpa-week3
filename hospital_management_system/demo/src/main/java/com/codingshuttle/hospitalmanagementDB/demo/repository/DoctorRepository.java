package com.codingshuttle.hospitalmanagementDB.demo.repository;

import com.codingshuttle.hospitalmanagementDB.demo.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}