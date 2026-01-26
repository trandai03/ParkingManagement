package com.project.parking.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShiftAttendanceDTO {
    private Long id;

    private Long employeeShiftId;

    private Long employeeId;

    private String employeeName;

    private String shiftName;

    @JsonFormat(pattern = "HH:mm")
    private String shiftTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private String workDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime checkInTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime checkOutTime;

    private String notes;

    private String status;

    private Long parkingLotId;

    private String parkingLotName;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}