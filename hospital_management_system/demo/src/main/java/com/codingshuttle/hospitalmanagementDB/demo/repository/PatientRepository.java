package com.codingshuttle.hospitalmanagementDB.demo.repository;

import com.codingshuttle.hospitalmanagementDB.demo.dto.BloodGroupStats;
import com.codingshuttle.hospitalmanagementDB.demo.dto.CPatientInfo;
import com.codingshuttle.hospitalmanagementDB.demo.dto.PatientIndfo;
import com.codingshuttle.hospitalmanagementDB.demo.entity.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    @Query("select p.id as id,p.name as name,p.email as email from Patient p")
    List<PatientIndfo> getAllPatientIndfo();

    @Query("select new com.codingshuttle.hospitalmanagementDB.demo.dto.CPatientInfo (p.id,p.name) "+" from Patient p")
    List<CPatientInfo> getAllPatientInfoConcrete();

    @Query("select new com.codingshuttle.hospitalmanagementDB.demo.dto.BloodGroupStats(p.bloodGroup,"+
            "COUNT(p)) from Patient p group by p.bloodGroup order by COUNT(p) DESC")
    List<BloodGroupStats> getBloodStats();

    @Transactional
    @Modifying
    @Query("UPDATE Patient p set p.name=:name where p.id=:id")
    int updatePatientNameWithId(@Param("name")String name,@Param("id") Long id);
}
