package com.project.parking.dto.request;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSessionRequest {
    private Long lotId;
    private String licensePlate;
    private Integer code;
    private String vehicleType;
}
