package com.project.parking.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Request object for locking/unlocking member account")
public class LockMemberRequest {

    @NotBlank(message = "Lock reason is required when locking")
    @Schema(description = "Lý do khóa thẻ", example = "Vi phạm quy định bãi xe")
    private String lockReason;
}

