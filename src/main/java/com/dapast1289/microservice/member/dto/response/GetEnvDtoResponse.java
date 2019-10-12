package com.dapast1289.microservice.member.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetEnvDtoResponse {

    private String applicationName;
    private String profilesActive;

}
