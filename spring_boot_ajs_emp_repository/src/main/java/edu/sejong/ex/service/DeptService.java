package edu.sejong.ex.service;

import java.util.List;

import edu.sejong.ex.vo.DeptVO;

public interface DeptService{
	List<DeptVO> getList();
	void insert(int deptno, String dname, String ioc);
	void delete(int deptno);
}