package com.project.parking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {
    private Long id;
    private Long memberId;
    private String licensePlate;
    private String vehicleType;
}