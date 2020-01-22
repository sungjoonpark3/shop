package com.shop.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	public void updateMember(MemberVO memberVO) {
		MemberVO findMemberVO=memberRepository.findById(memberVO.getSeq()).get();
		//수정 할 리스트 
		findMemberVO.setUserPassword(memberVO.getUserPassword());
		findMemberVO.setUserEmail(memberVO.getUserEmail());
		findMemberVO.setUserDate(memberVO.getUserDate());
		findMemberVO.setUserPhone1(memberVO.getUserPhone1());
		findMemberVO.setUserPhone2(memberVO.getUserPhone2());
		findMemberVO.setUserPhone3(memberVO.getUserPhone3());
		findMemberVO.setAddressPostNumber(memberVO.getAddressPostNumber());
		findMemberVO.setAddressRoadName(memberVO.getAddressRoadName());
		findMemberVO.setAddressGnumberName(memberVO.getAddressGnumberName());
		findMemberVO.setAddressDetail(memberVO.getAddressDetail());
		memberRepository.save(findMemberVO);		
	}

	//member Delete(삭제)
	@Override
	public void deleteMember(MemberVO memberVO) {
		memberRepository.deleteById(memberVO.getSeq());
		
	}
	
	//member List(회원목록)
	@Override
	public Page<MemberVO> getMemberList(MemberVO memberVO,int startPage) {
		Pageable pageable=PageRequest.of(startPage, 100, Sort.Direction.DESC, "seq");
		return memberRepository.getMemberList(pageable);
	}

	//member UpdateList (회원클릭후수정리스트)
	@Override
	public MemberVO getUpdateMemberList(MemberVO memberVO) {
		
		return memberRepository.findById(memberVO.getSeq()).get();
	}
	
	
}
