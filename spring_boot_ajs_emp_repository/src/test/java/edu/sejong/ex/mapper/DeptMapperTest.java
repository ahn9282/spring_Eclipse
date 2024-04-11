package edu.sejong.ex.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.DeptVO;
import lombok.extern.slf4j.Slf4j;
@SpringBootTest
@Slf4j
class DeptMapperTest {
	
	@Autowired
	DeptMapper deptMapper;

	@Test
	void testDeptList() {
		List<DeptVO> depts = deptMapper.deptList();
		
		for(DeptVO dept : depts) {
			log.info("dept = {}",dept);
		}
	}

}
