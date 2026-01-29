package com.project.parking.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Request object for registering a user as a member")
public class CreateMemberRequest {

    @NotNull(message = "Parking lot ID is required")
    @Schema(description = "ID của bãi đỗ xe đăng ký member", example = "1")
    private Long parkingLotId;

    @NotNull(message = "Plan ID is required")
    @Schema(description = "ID của gói đăng ký", example = "1")
    private Long planId;

    @NotNull(message = "License plate is required")
    @Schema(description = "Biển số xe (nếu có)", example = "59A-12345")
    private String licensePlate;

    @NotNull(message = "Vehicle type is required")
    @Schema(description = "Loại xe", example = "CAR")
    private String vehicleType;

    @NotNull(message = "Date of birth is required")
    @Schema(description = "Ngày sinh", example = "1990-01-01")
    private LocalDate dateOfBirth;

    @NotNull(message = "Address is required")
    @Schema(description = "Địa chỉ", example = "123 Nguyễn Huệ, Q.1, TP.HCM")
    private String address;

    @NotNull(message = "Phone number is required")
    @Schema(description = "Số điện thoại", example = "0901234567")
    private String phoneNumber;

    @NotNull(message = "Email is required")
    @Schema(description = "Email", example = "member@example.com")
    private String email;

    @NotNull(message = "Full name is required")
    @Schema(description = "Họ và tên", example = "Nguyễn Văn A")
    private String fullname;
    
    @Schema(description = "Số phòng", example = "C101")
    private String roomNumber;


}
