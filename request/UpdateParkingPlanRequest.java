package com.project.parking.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Request object for updating a parking plan")
public class UpdateParkingPlanRequest {

    @Schema(description = "Tên gói", example = "Cao Cấp Pro")
    private String name;

    @Schema(description = "Mô tả gói", example = "Gói cao cấp với nhiều tiện ích")
    private String description;

    @Positive(message = "Price must be positive")
    @Schema(description = "Giá gói", example = "350000")
    private BigDecimal price;

    @Schema(description = "Đơn vị giá (HOUR, DAY, MONTH, QUARTER, YEAR)", example = "DAY")
    private String priceUnit;

    @Schema(description = "Loại gói (PREMIUM, STANDARD, BASIC, ECONOMY)", example = "PREMIUM")
    private String planType;

    @Schema(description = "Đậu xe không giới hạn")
    private Boolean isUnlimitedParking;

    @Schema(description = "Có chỗ cố định")
    private Boolean hasFixedSpot;

    @Schema(description = "Có dịch vụ Valet")
    private Boolean hasValetService;

    @Schema(description = "Có rửa xe miễn phí")
    private Boolean hasCarWash;

    @Schema(description = "Có mái che")
    private Boolean hasCoveredParking;

    @Schema(description = "An ninh 24/7")
    private Boolean hasSecurity247;

    @Schema(description = "Gói phổ biến")
    private Boolean isPopular;

    @Schema(description = "Gói đang hoạt động")
    private Boolean isActive;

    @Schema(description = "Thứ tự hiển thị")
    private Integer sortOrder;
}

