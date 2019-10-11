package com.dapast1289.microservice.member.service;

import com.dapast1289.microservice.member.entity.MemberEntity;
import com.dapast1289.microservice.member.repository.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberDao memberDao;

    public List<MemberEntity> getAll() {
        return memberDao.getAll();
    }
}
