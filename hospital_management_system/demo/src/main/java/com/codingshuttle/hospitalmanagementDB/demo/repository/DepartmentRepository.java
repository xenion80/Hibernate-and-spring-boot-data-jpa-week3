package com.codingshuttle.hospitalmanagementDB.demo.repository;

import com.codingshuttle.hospitalmanagementDB.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}