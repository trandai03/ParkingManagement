package com.project.parking.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdatePasswordDTO {
    @NotBlank(message = "Current password is required")
    private String password;

    @NotBlank(message = "New password is required")
    private String newPassword;

    private String retypePassword;
}