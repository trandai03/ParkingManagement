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
public class PaymentDTO {
    private Long id;
    private Long sessionId;
    private BigDecimal amount;
    private String paymentMethod;
    private String status;
    private LocalDateTime paymentTime;
}