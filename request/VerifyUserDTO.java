package com.project.parking.dto.request;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VerifyUserDTO {
    private String email;
    private String verificationCode;
}