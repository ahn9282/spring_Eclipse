package edu.sejong.ex.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.sejong.ex.vo.DeptVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class DeptServiceImplTest {

	
	@Autowired
	DeptService deptService;
	
	@Test
	public void testDeptService() {
		List<DeptVO> list = deptService.getDeptList();
		log.info("list Size = {}", list.size());
		
		for(DeptVO dept : list) {
			log.info("dept of DeptList + {}", dept);
			
		}
		
	}

}
