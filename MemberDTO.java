package com.project.parking.dto;

import com.project.parking.enums.MemberStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO for member data transfer")
public class MemberDTO {

    private Long id;
    private String memberCode;
    private String username;
    private String email;
    private String fullname;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String address;
    private MemberStatus memberStatus;
    private LocalDateTime membershipStartDate;
    private LocalDateTime membershipExpiryDate;
    private BigDecimal membershipFee;
    private Boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

