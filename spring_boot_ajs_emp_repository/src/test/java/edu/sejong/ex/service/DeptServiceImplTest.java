package edu.sejong.ex.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.repository.DeptRepository;
import edu.sejong.ex.vo.DeptVO;

@SpringBootTest
class DeptServiceImplTest {
	
	@Autowired
	private DeptRepository deptRepository;
	@Autowired
	private DeptService service = new DeptServiceImpl();

	@Test
	void testDeptServiceImpl() {
		
		
		List<DeptVO> list = service.getList();
		
		assertNotNull(list);
		assertNotNull(service);
		assertNotNull(deptRepository);
	}
	
	@Test
	void testDeptServiceImpl2() {
		List<DeptVO> list = deptRepository.selectList();
		List<DeptVO> list1 = service.getList();
		assertNotNull(list);
		
		 for (DeptVO deptVO : list) { 
			 System.out.println("부서 이름 : "+
		  deptVO.getDname()); 
			 System.out.println("부서 번호 : "+ deptVO.getDeptno());
		  System.out.println("부서 위치 : "+ deptVO.getLoc()); }
		 
		assertThat(list.size()).isEqualTo(list1.size());
	}
	@Test
	void testDeptServiceImpl3() {
		service.insert(1, "asd","qwe");
		List<DeptVO> list1 = service.getList();
		 for (DeptVO deptVO : list1) { 
			 System.out.println("부서 이름 : "+
		  deptVO.getDname()); 
			 System.out.println("부서 번호 : "+ deptVO.getDeptno());
		  System.out.println("부서 위치 : "+ deptVO.getLoc()); }
	}

}
