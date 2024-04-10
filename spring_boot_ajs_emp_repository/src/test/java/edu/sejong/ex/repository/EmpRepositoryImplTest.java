package edu.sejong.ex.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.EmpVO;
@SpringBootTest
class EmpRepositoryImplTest {
	
	@Autowired
	EmpRepository eRepo = new EmpRepositoryImpl();
	Timestamp t = new Timestamp(0);
	EmpVO emp = new EmpVO(1,"1","1","1",t ,1,"1",1);
	
	@Test
	void empRepositoryTest() {
		List<EmpVO> empList = eRepo.showList();
		assertThat(empList.size()).isEqualTo(18);
	}
	
	@Test
	void empRepositoryTest2() {
		List<EmpVO> empList = eRepo.showList();
		int a = empList.size()+1;
		eRepo.insertEmp(emp);
		 empList = eRepo.showList();
		assertThat(empList.size()).isEqualTo(a);
	}
	
	@Test
	void empRepositoryTest3() {
		List<EmpVO> empList1 = eRepo.showList();
		eRepo.removeEmp(emp);
		List<EmpVO> empList2 = eRepo.showList();
		assertThat(empList1.size()).isNotEqualTo(empList2.size());
	}

}
