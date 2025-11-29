package com.codingshuttle.hospitalmanagementDB.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true,length = 100)
    private String name;

    @OneToOne
    @JoinColumn(nullable = false)
    private Doctor headDoctor;

    @ManyToMany
    private Set<Doctor> doctors=new HashSet<>();//by default hashset is null, so when we put data in hashset it gives error;
}
