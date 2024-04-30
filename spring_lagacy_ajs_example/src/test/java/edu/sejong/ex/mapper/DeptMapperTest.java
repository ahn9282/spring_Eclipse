package edu.sejong.ex.mapper;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.sejong.ex.vo.DeptVO;


@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class DeptMapperTest {

	
	@Autowired
	DeptMapper DeptMapper;
	@Test
	public void testDeptMapper() {
		assertNotNull(DeptMapper);
		
		for(DeptVO vo : DeptMapper.getDeptList()) {
				System.out.println("vo = " + vo);
		}
	}

}
