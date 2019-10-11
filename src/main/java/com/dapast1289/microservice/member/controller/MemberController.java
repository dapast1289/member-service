package com.dapast1289.microservice.member.controller;

import com.dapast1289.microservice.member.entity.MemberEntity;
import com.dapast1289.microservice.member.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "")
@Api(value = "mem")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @ApiOperation(value = "取得書本", notes = "列出所有書本")
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MemberEntity>> index() {

        List<MemberEntity> allMembers = memberService.getAll();
        return new ResponseEntity<>(allMembers, HttpStatus.OK);
    }
}
