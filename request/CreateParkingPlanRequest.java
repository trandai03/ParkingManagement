package com.project.parking.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Request object for creating a new parking plan")
public class CreateParkingPlanRequest {

    @NotNull(message = "Parking lot ID is required")
    @Schema(description = "ID của bãi đỗ xe", example = "1")
    private Long parkingLotId;

    @NotBlank(message = "Plan name is required")
    @Schema(description = "Tên gói", example = "Cao Cấp")
    private String name;

    @Schema(description = "Mô tả gói", example = "Gói này bao gồm tất cả các dịch vụ đi kèm với một chỗ đậu xe!")
    private String description;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be positive")
    @Schema(description = "Giá gói", example = "300000")
    private BigDecimal price;

    @NotBlank(message = "Price unit is required")
    @Schema(description = "Đơn vị giá (HOUR, DAY, MONTH, QUARTER, YEAR)", example = "DAY")
    private String priceUnit;

    @NotBlank(message = "Plan type is required")
    @Schema(description = "Loại gói (PREMIUM, STANDARD, BASIC, ECONOMY)", example = "PREMIUM")
    private String planType;

    @Schema(description = "Đậu xe không giới hạn", example = "true")
    private Boolean isUnlimitedParking = false;

    @Schema(description = "Có chỗ cố định", example = "false")
    private Boolean hasFixedSpot = false;

    @Schema(description = "Có dịch vụ Valet", example = "true")
    private Boolean hasValetService = false;

    @Schema(description = "Có rửa xe miễn phí", example = "true")
    private Boolean hasCarWash = false;

    @Schema(description = "Có mái che", example = "true")
    private Boolean hasCoveredParking = false;

    @Schema(description = "An ninh 24/7", example = "true")
    private Boolean hasSecurity247 = false;

    @Schema(description = "Gói phổ biến", example = "false")
    private Boolean isPopular = false;

    @Schema(description = "Thứ tự hiển thị", example = "1")
    private Integer sortOrder = 0;

    @Schema(description = "Thời gian sử dụng gói (tháng)", example = "1")
    private Integer durationMonths = 1;
}

