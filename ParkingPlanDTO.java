package com.project.parking.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for parking plan information")
public class ParkingPlanDTO {

    private Long id;
    private Long parkingLotId;
    private String parkingLotName;
    private String name;
    private String description;
    private BigDecimal price;
    private String priceUnit;
    private String planType;
    private Boolean isUnlimitedParking;
    private Boolean hasFixedSpot;
    private Boolean hasValetService;
    private Boolean hasCarWash;
    private Boolean hasCoveredParking;
    private Boolean hasSecurity247;
    private Boolean isPopular;
    private Boolean isActive;
    private Integer sortOrder;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

