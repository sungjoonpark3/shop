package com.shop;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shop.member.domain.MemberVO;
import com.shop.member.persistence.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataTest {

	@Autowired
	private MemberRepository Mrpo;
	
	@Test
	public void testData() {
		for(int i =101;i<600;i++) {
		MemberVO m1 = new MemberVO();
		
		m1.setUserId("testdata"+i+"번째");
		m1.setUserName("testData"+i);
		m1.setUserPassword("testdata");
		m1.setUserEmail("testdata"+i);
		m1.setUserPhone1("010");
		m1.setUserPhone2("3496");
		m1.setUserPhone3("1234");
		m1.setAddressPostNumber("123455");
		m1.setAddressRoadName("서울시동작구대방동");
		m1.setAddressGnumberName("1404012");
		m1.setAddressDetail("동작구대방동주소요");	
		
		Mrpo.save(m1);
		}
	} 
}
