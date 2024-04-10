package edu.sejong.ex.vo;


import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class MemberVOTest {

	@Test
	void tstMemberVo() {
		MemberVo memberVo = new MemberVo();
		System.out.println(memberVo);
		MemberVo memberVo2 = new MemberVo();
		
		memberVo.setAge(10);
		memberVo.setName("홍길동");
		
		assertNotNull(memberVo2);
		assertEquals(memberVo.getAge(),10);
		assertEquals(memberVo.getName(),"홍길동");
		assertThat(memberVo).isNotEqualTo(memberVo2);
	}
	@Test
	void tstMemberVoArgs() {
		
		MemberVo memberVo2 = new MemberVo("홍길동","qwe@naver.com","1234","asd",234);
		System.out.println(memberVo2);
		assertThat(memberVo2.getEmail()).isEqualTo("qwe@naver.com");
		
	}
}
