package com.dapast1289.microservice.member.controller;

import com.dapast1289.microservice.member.config.EnvConfig;
import com.dapast1289.microservice.member.dto.response.GetEnvDtoResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "env")
public class EnvController {

    @Autowired
    private EnvConfig envConfig;

    @ApiOperation(value = "get env config")
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GetEnvDtoResponse> getEnv() {
        GetEnvDtoResponse result = GetEnvDtoResponse.builder()
                .applicationName(envConfig.getApplicationName())
                .profilesActive(envConfig.getProfilesActive())
                .build();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
