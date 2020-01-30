package com.shop.qnaboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.shop.qnaboard.domain.QnaBoardVO;
import com.shop.qnaboard.persistence.QnaBoardRepository;

@Service
public class QnaBoardServiceImpl implements QnaBoardService{

	@Autowired
	private QnaBoardRepository qnaBoardRepository;
	
	//QnaBoard Insert(입력);
	@Override
	public void insertQnaBoard(QnaBoardVO qnaBoardVO) {
		qnaBoardRepository.save(qnaBoardVO);		
	}

	//QnaBoard update(수정);
	@Override
	public void updateQnaBoard(QnaBoardVO qnaBoardVO) {
		QnaBoardVO findqnaBoardVO=qnaBoardRepository.findById(qnaBoardVO.getSeq()).get();
		
		//QnaBoard 수정항목 부분
		findqnaBoardVO.setContent(qnaBoardVO.getContent());
		findqnaBoardVO.setContentCategory(qnaBoardVO.getContentCategory());
		findqnaBoardVO.setTitle(qnaBoardVO.getTitle());
		
		//QnaBoard 수정항목 부분 마지막으로 저장
		qnaBoardRepository.save(findqnaBoardVO);
	}

	//QnaBoard delete(삭제);
	@Override
	public void deleteQnaBoard(QnaBoardVO qnaBoardVO) {
		qnaBoardRepository.deleteById(qnaBoardVO.getSeq());		
	}

	//QnaBoard List(QnaBoardList 페이징);
	@Override
	public Page<QnaBoardVO> getQnaBoardList(QnaBoardVO qnaboardVO, int startPage) {
		Pageable pageable=PageRequest.of(startPage, 20, Sort.Direction.DESC, "seq");
		return qnaBoardRepository.getQnaBoardList(pageable);
	}

}
