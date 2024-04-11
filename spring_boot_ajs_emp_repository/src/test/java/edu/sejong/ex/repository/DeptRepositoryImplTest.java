package edu.sejong.ex.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.DeptVO;

@SpringBootTest
class DeptRepositoryImplTest {
	
	@Autowired
	private DeptRepository deptRepository;

	@Test
	void testDeptRepository() {
		assertNotNull(deptRepository);
	}
	
	@Test
	void testSelectList() {
		for (DeptVO dept : deptRepository.selectList()) {
			System.out.println("부서 이름 : "+ dept.getDname());
			System.out.println("부서 번호 : "+ dept.getDeptno());
			System.out.println("부서 위치 : "+ dept.getLoc());
		}
	}

}
