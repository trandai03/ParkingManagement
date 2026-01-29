package com.project.parking.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Request object for updating member information")
public class UpdateMemberRequest {

    @Schema(description = "Tên đăng nhập", example = "member001")
    private String username;

    @Email(message = "Invalid email format")
    @Schema(description = "Email", example = "member@example.com")
    private String email;

    @Schema(description = "Họ và tên", example = "Nguyễn Văn A")
    private String fullname;

    @Schema(description = "Ngày sinh", example = "1990-01-15")
    private LocalDate dateOfBirth;

    @Pattern(regexp = "^[0-9]{10,11}$", message = "Invalid phone number")
    @Schema(description = "Số điện thoại", example = "0901234567")
    private String phoneNumber;

    @Schema(description = "Địa chỉ", example = "123 Nguyễn Huệ, Q.1, TP.HCM")
    private String address;
}

