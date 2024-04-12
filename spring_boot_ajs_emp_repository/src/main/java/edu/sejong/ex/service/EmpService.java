package edu.sejong.ex.service;

import java.util.List;


import edu.sejong.ex.vo.DeptVO;
import edu.sejong.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

public interface EmpService{
List<EmpVO> empList();
	
	void insertEmp(EmpVO emp);
	
	void deleteEmp(EmpVO emp);

}