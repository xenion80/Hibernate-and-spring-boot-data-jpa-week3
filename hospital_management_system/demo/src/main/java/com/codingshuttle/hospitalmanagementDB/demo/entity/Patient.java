package com.codingshuttle.hospitalmanagementDB.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.codingshuttle.hospitalmanagementDB.demo.entity.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@ToString
@Getter
@Setter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private LocalDate birthDate;

    private String email;

    private String gender;
    @Enumerated(value = EnumType.STRING)

    private BloodGroupType bloodGroup;
    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne
    @JoinColumn(name="patient_insurance",unique = true)
    private Insurance insurance;//owning side
    @OneToMany(mappedBy = "patient")//inverse side of the relationship
    private Set<Appointment> appointments=new HashSet<>();
}
