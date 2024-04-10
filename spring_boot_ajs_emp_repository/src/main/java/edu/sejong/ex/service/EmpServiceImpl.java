package edu.sejong.ex.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.repository.DeptRepository;
import edu.sejong.ex.repository.EmpRepository;
import edu.sejong.ex.vo.DeptVO;
import edu.sejong.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Service // @Component + 의미(Command) = 비즈니스 로직
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpRepository empRepository;

	@Override
	public List<EmpVO> getList() {
		List<EmpVO> empList = empRepository.showList();
		return empList;
	}

	@Override
	public void addEmp(EmpVO emp) {
		
		empRepository.insertEmp(emp);
		
	}

	@Override
	public void removeEmp(EmpVO emp) {
		empRepository.removeEmp(emp);
	}

	
	
	
}
