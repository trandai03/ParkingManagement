package com.project.parking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLotDTO {
    private Long id;
    private String name;
    private String address;
    private Integer capacity;
    private Integer availableSpots;
    private BigDecimal hourlyRate;
    private String status;
    private Long ownerId;
    private Integer availableSlots;
    private String operatingHours;
    private BigDecimal dailyRate;
    private String vehicleTypes;
    private Boolean isCovered;

}