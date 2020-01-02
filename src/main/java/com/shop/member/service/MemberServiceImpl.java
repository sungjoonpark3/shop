package com.shop.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.member.domain.MemberVO;
import com.shop.member.persistence.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepository;

	//member Insert(입력)
	@Override
	public void insertMember(MemberVO memberVO) {
		memberRepository.save(memberVO);
	}

	//member Update(수정)
	@Override
	public void updateMember(MemberVO memeberVO) {
		MemberVO findMemberVO=memberRepository.findById(memeberVO.getSeq()).get();
		//수정할 리스트 set으로 아래처럼구현하면됨
		//findMemberVO.setUserPassword(memeberVO.getUserPassword());
		memberRepository.save(findMemberVO);		
	}

	//member Delete(삭제)
	@Override
	public void deleteMember(MemberVO memberVO) {
		memberRepository.deleteById(memberVO.getSeq());
		
	}
	
	//member List(회원목록)
	@Override
	public List<MemberVO> getMemberList(MemberVO memberVO) {
		
		return (List<MemberVO>) memberRepository.findAll();
	}

	//member UpdateList (회원클릭후수정리스트)
	@Override
	public MemberVO getUpdateMemberList(MemberVO memberVO) {
		
		return memberRepository.findById(memberVO.getSeq()).get();
	}
	
	
}
