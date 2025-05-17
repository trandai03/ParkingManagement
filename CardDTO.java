package com.project.parking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardDTO {
    private Long id;
    private String cardNumber;
    private String cardType;
    private Long userId;
    private String userName;
    private Long vehicleId;
    private String licensePlate;
    private LocalDateTime validFrom;
    private LocalDateTime validTo;
    private String status;
}