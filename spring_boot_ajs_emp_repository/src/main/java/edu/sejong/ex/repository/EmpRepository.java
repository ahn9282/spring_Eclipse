package edu.sejong.ex.repository;

import java.util.List;

import edu.sejong.ex.vo.DeptVO;
import edu.sejong.ex.vo.EmpVO;

public interface EmpRepository{
	List<EmpVO> showList();
	void insertEmp(EmpVO emp);
	void removeEmp(EmpVO emp);
}