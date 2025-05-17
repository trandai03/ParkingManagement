package com.project.parking.dto.request;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentStatusUpdateDTO {
    private String status;
}