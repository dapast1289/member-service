package com.dapast1289.microservice.member.repository.dao;

import com.dapast1289.microservice.member.entity.MemberEntity;
import com.dapast1289.microservice.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberDao {

    @Autowired
    private MemberRepository memberRepository;

    public List<MemberEntity> getAll() {
        return memberRepository.findAll();
    }
}
