package com.project.parking.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeShiftDTO {
    private Long id;

    private Long employeeId;

    private String employeeName;

    private Long shiftId;

    private String shiftName;

    @JsonFormat(pattern = "HH:mm")
    private String shiftTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate workDate;

    private DayOfWeek dayOfWeek;

    private Boolean isRecurring;

    private String status;

    private Long parkingLotId;

    private String parkingLotName;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}