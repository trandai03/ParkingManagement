package com.project.parking.dto.request;

import com.project.parking.enums.MemberStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Request object for searching members")
public class MemberSearchRequest {

    @Schema(description = "Số điện thoại", example = "0901234567")
    private String phoneNumber;

    @Schema(description = "Biển số xe", example = "59A-12345")
    private String licensePlate;

    @Schema(description = "Mã thẻ member", example = "MEM-2026-00001")
    private String memberCode;

    @Schema(description = "Tên hoặc username", example = "Nguyễn Văn A")
    private String keyword;

    @Schema(description = "Email", example = "member@example.com")
    private String email;


    @Schema(description = "Trạng thái thẻ", example = "ACTIVE")
    private MemberStatus memberStatus;

    @Schema(description = "Số trang (bắt đầu từ 0)", example = "0")
    private Integer page = 0;

    @Schema(description = "Số phần tử mỗi trang", example = "10")
    private Integer size = 10;
}

