package com.project.parking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSessionDTO {
    private Long id;
    private Long lotId;
    private Long vehicleId;
    private String licensePlate;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private String licensePlateImageEntry;
    private String licensePlateImageExit;
    private String status;
    private BigDecimal totalCost;
}