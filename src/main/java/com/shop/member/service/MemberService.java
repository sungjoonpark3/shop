package com.shop.member.service;

import java.util.List;

import com.shop.member.domain.MemberVO;

public interface MemberService {

	//member 가입
	void insertMember(MemberVO memberVO);
	
	//member 정보수정
	void updateMember(MemberVO memeberVO);
	
	//member 회원삭제
	void deleteMember(MemberVO memberVO);
	
	//member 리스트 
	List<MemberVO> getMemberList(MemberVO memberVO);
	
	//member 정보변경리스트
	MemberVO getUpdateMemberList(MemberVO memberVO);
	
}
