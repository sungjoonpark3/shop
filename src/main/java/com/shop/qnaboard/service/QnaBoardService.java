package com.shop.qnaboard.service;

import org.springframework.data.domain.Page;

import com.shop.qnaboard.domain.QnaBoardVO;

public interface QnaBoardService {

	//QnaBoard 등록QnaBoardService
	void insertQnaBoard(QnaBoardVO qnaBoardVO);
	//QnaBoard 수정
	void updateQnaBoard(QnaBoardVO qnaBoardVO);
	
	//QnaBoard 삭제
	void deleteQnaBoard(QnaBoardVO qnaBoardVO);
	
	//QnaBoard 리스트
	Page<QnaBoardVO> getQnaBoardList(QnaBoardVO qnaBoardVO,int startPage);
	
	
	
}
