package com.project.parking.dto;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "DTO for parking session information")
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
    private Integer code;
    
    @Schema(description = "Xe có thuộc về member đang hoạt động không")
    private Boolean isMemberVehicle;
    
    @Schema(description = "Mã thẻ member (nếu là xe của member)")
    private String memberCode;
}