package edu.sejong.ex.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.mapper.EmpMapper;
import edu.sejong.ex.repository.DeptRepository;
import edu.sejong.ex.repository.EmpRepository;
import edu.sejong.ex.vo.DeptVO;
import edu.sejong.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Service // @Component + 의미(Command) = 비즈니스 로직
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpMapper empMapper;

	@Override
	public List<EmpVO> empList() {
		List<EmpVO> list = empMapper.empList();
		return list;
	}

	@Override
	public void insertEmp(EmpVO emp) {
		empMapper.insertEmp(emp);
		
	}

	@Override
	public void deleteEmp(EmpVO emp) {
		empMapper.deleteEmp(emp);
	}

	
	
	
}
