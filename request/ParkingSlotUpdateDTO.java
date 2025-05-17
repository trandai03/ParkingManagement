package com.project.parking.dto.request;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSlotUpdateDTO {
    private String status;
    private Integer availableSlots;
}