package com.project.parking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String position;
    private Long parkingLotId;
    private String parkingLotName;
    private LocalDate joinDate;
    private String status;
}