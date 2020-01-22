package com.shop.member.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.shop.member.domain.MemberVO;

public interface MemberRepository extends CrudRepository<MemberVO,Long>{

	@Query("SELECT b FROM MemberVO b")
	Page<MemberVO> getMemberList(Pageable pageable);
}
