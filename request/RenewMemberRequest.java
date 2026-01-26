package com.project.parking.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Request object for renewing member subscription")
public class RenewMemberRequest {

    @NotNull(message = "Membership type is required")
    @Schema(description = "Loại gói gia hạn", example = "MONTHLY")
    private Long planId;

    @Schema(description = "Ghi chú", example = "Gia hạn theo yêu cầu khách hàng")
    private String note;


}

