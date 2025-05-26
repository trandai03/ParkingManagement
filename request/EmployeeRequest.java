package com.project.parking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
    private Long parkingLotId;
    private UserDTO userDTO;
    private LocalDateTime joinDate;
    private String status;
    private Long employeeId;
    private UpdateUserDTO updateUserDTO;
}
