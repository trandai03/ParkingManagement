package com.project.parking.dto;

import com.project.parking.dto.request.UserDTO;
import com.project.parking.model.Employee;
import com.project.parking.response.user.UserResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;
    private String email;
    private String phone;
    private Long parkingLotId;
    private String parkingLotName;
    private UserResponse userResponse;
    private LocalDate joinDate;
    private String status;

    public static EmployeeDTO fromEmployee(Employee employee) {
        return EmployeeDTO.builder()
                .id(employee.getId())
                .email(employee.getUser().getEmail())
                .phone(employee.getUser().getPhoneNumber())
                .parkingLotId(employee.getParkingLot().getId())
                .parkingLotName(employee.getParkingLot().getName())
                .userResponse(UserResponse.fromUser(employee.getUser()))
                .joinDate(employee.getJoinDate())
                .status(employee.getStatus())
                .build();

    }

    public static List<EmployeeDTO> fromEmployees(List<Employee> employees) {
        return employees.stream()
                .map(EmployeeDTO::fromEmployee)
                .collect(Collectors.toList());
    }
}