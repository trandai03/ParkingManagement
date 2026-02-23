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
@Schema(description = "Request object for update member status")
public class StatusMemberRequest {
    MemberStatus memberStatus;
}
