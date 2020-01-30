package com.shop.qnaboard.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
public class QnaBoardVO {
	@Id
	@GeneratedValue
	private Long seq;
	
	private String title;
	
	//분류-구매,주문,취소,기타
	private String contentCategory;
	
	//qna - 내용 
	private String content;
	
	//qna 등록일
	private Date createDate = new Date();
	
	//qna 수정일
	private Date updateDate = new Date();
	
	@Column(updatable=true)
	private Long cnt = 0L;

}
