package com.codingshuttle.hospitalmanagementDB.demo.dto;

import com.codingshuttle.hospitalmanagementDB.demo.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long count;
}
