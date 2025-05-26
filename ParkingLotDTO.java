package com.project.parking.dto;

import com.project.parking.model.ParkingLot;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

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
    private List<EmployeeDTO> employeeDTOs;

    public static ParkingLotDTO fromParkingLot(ParkingLot parkingLot) {
        return ParkingLotDTO.builder()
                .id(parkingLot.getId())
                .name(parkingLot.getName())
                .address(parkingLot.getAddress())
                .capacity(parkingLot.getCapacity())
                .availableSpots(parkingLot.getAvailableSlots())
                .hourlyRate(parkingLot.getHourlyRate())
                .status(parkingLot.getStatus())
                .ownerId(parkingLot.getOwner().getId())
                .availableSlots(parkingLot.getAvailableSlots())
                .operatingHours(parkingLot.getOperatingHours())
                .dailyRate(parkingLot.getDailyRate())
                .vehicleTypes(parkingLot.getVehicleTypes())
                .isCovered(parkingLot.getIsCovered())
                .employeeDTOs(parkingLot.getEmployees() != null ? EmployeeDTO.fromEmployees(parkingLot.getEmployees()) : null)
                .build();
    }
    
    

}