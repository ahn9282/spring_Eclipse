package edu.sejong.ex.service;

import java.util.List;

import edu.sejong.ex.vo.DeptVO;

public interface DeptService{
	List<DeptVO> getList();
	List<DeptVO> deptList();
	void insert(int deptno, String dname, String loc);
	void delete(int deptno);
	void insertDept(DeptVO deptVO);
	void deleteDept(DeptVO deptVO);
}