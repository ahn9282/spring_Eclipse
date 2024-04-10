package edu.sejong.ex.repository;

import java.util.List;

import edu.sejong.ex.vo.DeptVO;
import edu.sejong.ex.vo.EmpVO;

public interface DeptRepository{

	List<DeptVO> selectList();
	void insert(int deptno, String dname, String ioc);
	void delete(int deptno);
}