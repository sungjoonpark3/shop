package com.shop.qnaboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.qnaboard.domain.QnaBoardVO;
import com.shop.qnaboard.service.QnaBoardService;

@Controller
@RequestMapping("/qnaboard/")
public class QnaBoardController {
	
	@Autowired
	private QnaBoardService qnaBoardService;
	
	//qnaboard 목록 불러오기
	@GetMapping("getListQnaBoard")
	public String getListQnaBoard(@RequestParam(value="page",defaultValue="0") int page,Model model,QnaBoardVO qnaBoardVO) {
		Page<QnaBoardVO> qnaboardlist = qnaBoardService.getQnaBoardList(qnaBoardVO,page);
		model.addAttribute("qnaboardlist",qnaboardlist);
		model.addAttribute("pages",qnaboardlist);
		model.addAttribute("maxPage",10);
		return "qnaboard/getListQnaBoard";
	}
	//qnaboard 수정 불러오기
	
	//qnaboard 가입 입력화면
	
	//qnaboard 가입 화면
	
	//qnaboard 삭제 후 페이지 이동 -> 목록

}
