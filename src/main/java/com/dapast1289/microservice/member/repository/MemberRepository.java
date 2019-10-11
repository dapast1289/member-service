package com.dapast1289.microservice.member.repository;

import com.dapast1289.microservice.member.entity.MemberEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends CrudRepository<MemberEntity, Long> {

    @Override
    List<MemberEntity> findAll();
}
