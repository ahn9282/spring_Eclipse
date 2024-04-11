package edu.sejong.ex.mapper;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
class TimeMapperTest2 {

	@Autowired
	private TimeMapper timeMapper;
	
	@Test
	void testGetTime2() {
			log.info("시간이 나올까? ================={}",timeMapper.getTime2());
	}
	
	@Test
	void textOPO() {
		log.info("1 + 1 = {}", timeMapper.getOnePlusOne2());
	}
}
