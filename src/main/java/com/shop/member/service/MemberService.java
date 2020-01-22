package com.shop.member.service;

import org.springframework.data.domain.Page;

import com.shop.member.domain.MemberVO;

public interface MemberService {

	//member 가입
	void insertMember(MemberVO memberVO);
	
	//member 정보수정
	void updateMember(MemberVO memeberVO);
	
	//member 회원삭제
	void deleteMember(MemberVO memberVO);
	
	//member 리스트 
	Page<MemberVO> getMemberList(MemberVO memberVO,int startPage);
	
	//	member 리스트 (List 형태로 받아올때) -> Page 리스트 (Page 형태로 리스트 변경)
	//	List<MemberVO> getMemberList(MemberVO memberVO);
	
	//member 정보변경리스트
	MemberVO getUpdateMemberList(MemberVO memberVO);
	
}
