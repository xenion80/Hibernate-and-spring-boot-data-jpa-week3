package com.codingshuttle.hospitalmanagementDB.demo.repository;

import com.codingshuttle.hospitalmanagementDB.demo.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}