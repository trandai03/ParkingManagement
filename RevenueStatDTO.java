package com.project.parking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RevenueStatDTO {
    private Long id;
    private Long parkingLotId;
    private String parkingLotName;
    private LocalDate date;
    private Integer totalSessions;
    private BigDecimal totalRevenue;
    private Integer averageDurationMinutes;
}