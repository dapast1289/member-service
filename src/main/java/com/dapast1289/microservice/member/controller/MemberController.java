package com.dapast1289.microservice.member.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;

@RestController
public class MemberController {

    @GetMapping(value = "")
    public ResponseEntity<String> index() {

        return new ResponseEntity<>("welcome to member service", HttpStatus.OK);
    }
}
