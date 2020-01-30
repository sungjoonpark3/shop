package com.shop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shop.qnaboard.domain.QnaBoardVO;
import com.shop.qnaboard.persistence.QnaBoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataQnaBoardTest {
	@Autowired
	private QnaBoardRepository qnaBoardRepository;
	
	@Test
	public void testQnaBoard() {
		for(int i =0;i<100;i++) {
		QnaBoardVO QBO = new QnaBoardVO();
		QBO.setTitle("제목:"+i);
		QBO.setContentCategory("카테고리:"+i);
		QBO.setContent("내용:"+i);
		
		qnaBoardRepository.save(QBO);
		}
	}
	
	

}
