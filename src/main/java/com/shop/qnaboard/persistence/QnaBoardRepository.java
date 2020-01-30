package com.shop.qnaboard.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.shop.qnaboard.domain.QnaBoardVO;

public interface QnaBoardRepository extends CrudRepository<QnaBoardVO,Long> {
	
	@Query("SELECT c FROM QnaBoardVO c")
	Page<QnaBoardVO> getQnaBoardList(Pageable pageable);
}
