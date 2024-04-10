package edu.sejong.ex.service;

import java.util.List;


import edu.sejong.ex.vo.DeptVO;
import edu.sejong.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

public interface EmpService{
	List<EmpVO> getList();
	void addEmp(EmpVO emp);
	
	void removeEmp(EmpVO emp);

}