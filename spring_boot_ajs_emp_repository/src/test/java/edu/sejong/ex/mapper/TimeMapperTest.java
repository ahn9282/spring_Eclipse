package edu.sejong.ex.mapper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.DeptVO;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
class TimeMapperTest {

	@Autowired
	private TimeMapper timeMapper;
	@Disabled
	@Test
	void test() {
		assertNotNull(timeMapper);
		log.info("timeMapperTime is {}", timeMapper.getTime());
	}
	@Disabled
	@Test
	void textOPO() {
		log.info("1 + 1 = {}", timeMapper.getOnePlusOne());
	}
	@Test
	void testEmpno() {
		log.info("empno = {}", timeMapper.getEmpEmpno());
		List<String> empNo = timeMapper.getEmpEmpno();
		for(String s : empNo) {
			System.out.println("empno :" + s);
		}
		
	}
	@Test
	void testDept() {
		log.info("empno = {}", timeMapper.getDept());
		List<DeptVO> empNo = timeMapper.getDept();
		for(DeptVO s : empNo) {
			System.out.println("empno :" + s);
		}
		
	}
	@Test
	void testGetTime2() {
			log.info("시간이 나올까? ================={}",timeMapper.getTime2());
	}

}
