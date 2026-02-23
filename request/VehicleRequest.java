package com.project.parking.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Request object for creating or updating a vehicle")
public class VehicleRequest {

    @NotBlank(message = "Vehicle type is required")
    @Schema(description = "Loại xe", example = "Car")
    private String vehicleType;

    @NotBlank(message = "License plate is required")
    @Pattern(regexp = "^[A-Z0-9-]+$", message = "License plate must contain only uppercase letters, numbers, and hyphens")
    @Schema(description = "Biển số xe", example = "51A-123.45")
    private String licensePlate;
}
