package edu.sejong.ex.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.sejong.ex.mapper.TimeMapper;
import edu.sejong.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmpServiceImplTest {

	@Autowired
	EmpService empService;
	@Autowired
	TimeMapper TimeMapper;
	
	@Test
	public void test() {
	
		assertNotNull(empService.empList());

	
	}

}
