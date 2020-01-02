package com.shop.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.member.domain.MemberVO;
import com.shop.member.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//member 목록 불러오기
	@GetMapping("/getListMember")
	public String getListMember(Model model,MemberVO memberVO) {
		List<MemberVO> memberlist=memberService.getMemberList(memberVO);
		model.addAttribute("memberlist",memberlist);
		return "member/getListMember";
	}
	//member 수정 목록불러오기
	@GetMapping("/getUpdateListMember")
	public String getUpdateListMember(MemberVO memberVO,Model model){
		model.addAttribute("memberVO",memberService.getUpdateMemberList(memberVO));
		return"member/updateMember";
	}
	
	
	//member 가입화면
	@GetMapping("/insertMember")
	public String insertMemberView() {
		return "member/insertMember";
	}
	
	//member 가입 입력화면
	@PostMapping("/insertMember")
	public String insertMember(MemberVO memberVO) {
		memberService.insertMember(memberVO);
		//추후 로그인 페인지로 이동하기로 변경하기
		return "redirect:index.html";
	}
	
	//member 수정화면
	@PostMapping("/updateMember")
	public String updateMember(MemberVO memberVO) {
		memberService.updateMember(memberVO);
		return "redirect:updateMember";
	}
	
	//member 삭제후 메인페이지로 이동
	@GetMapping("/deleteMember")
	public String deleteMember(MemberVO memberVO) {
		memberService.deleteMember(memberVO);
		return "forward:index";
	}
	
	

}
