package com.shop.member.persistence;

import org.springframework.data.repository.CrudRepository;

import com.shop.member.domain.MemberVO;

public interface MemberRepository extends CrudRepository<MemberVO,Long>{

}
