package com.shop.member.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class MemberVO {

	@Id
	@GeneratedValue
	private Long seq;
	
	//user 이름
	private String name;
	
	//user 아이디
	private String userId;
	
	//user 패스워드
	private String userPassword;
	
	//user 이메일
	private String userEmail;
	
	//user 핸드폰번호1
	private String userPhone1;
	
	//user 핸드폰번호2
	private String userPhone2;
	
	//user 핸드폰번호3
	private String userPhone3;
	
	//user 우편번호
	private String addressPostNumber;	
	
	//user 도로명주소
	private String addressRoadName;
	
	//user 지번주소
	private String addressGnumberName;
	
	//user 상세주소
	private String addressDetail;
	
	//user 등급-Default-basic
	private String userGrade;
	
	//user 가입일
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate = new Date();
	
	//user 수정일
	@LastModifiedDate
	private Date updateDate = new Date();
	
	
}
