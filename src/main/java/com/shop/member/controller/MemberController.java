package com.shop.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.member.domain.MemberVO;
import com.shop.member.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//member 목록 불러오기
	@GetMapping("/getListMember")
	public String getListMember(@RequestParam(value="page",defaultValue="0") int page,Model model,MemberVO memberVO) {
		Page<MemberVO> memberlist=memberService.getMemberList(memberVO,page);
		model.addAttribute("memberlist",memberlist);
		model.addAttribute("pages",memberlist);
		model.addAttribute("maxPage",10);
		return "member/getListMember";
	}
	
	//member 수정 목록불러오기
	@GetMapping("/getUpdateListMember")
	public String getUpdateListMember(MemberVO memberVO,Model model){
		model.addAttribute("memberVO",memberService.getUpdateMemberList(memberVO));
		return"member/updateMember";
	}
	
	//member 수정화면
	//member 개인정보 수정 후에 인덱스페이지로 이동
	@PostMapping("/updateMember")
	public String updateMember(MemberVO memberVO) {
		memberService.updateMember(memberVO);
		return "redirect:/";
	}
	
	
	//member 가입화면
	@GetMapping("/insertMember")
	public String insertMemberView() {
		return "member/insertMember";
	}
	
	//member 가입 입력화면
	@PostMapping("/insertMember")
	public String insertMember(MemberVO memberVO) {
		memberVO.setUserGrade("USER");
		memberService.insertMember(memberVO);
		//추후 로그인 페인지로 이동하기로 변경하기
		//회원가입 완료후 -> 가입완료 메시지 -> 홈으로 이동
		return "member/joinSucess";
	}
		
	//member 삭제후 메인페이지로 이동
	@GetMapping("/deleteMember")
	public String deleteMember(MemberVO memberVO) {
		memberService.deleteMember(memberVO);
		return "forward:getListMember";
	}
	
	//작업용
	//member 가입화면
	@GetMapping("/joinSucess")
	public String joinsucessMemberView() {
		return "member/joinSucess";
	}
	
	
	

}
