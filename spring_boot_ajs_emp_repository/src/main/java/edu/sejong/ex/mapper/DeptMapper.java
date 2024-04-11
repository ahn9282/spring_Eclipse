package edu.sejong.ex.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.sejong.ex.vo.DeptVO;


@Mapper
public interface DeptMapper{
	
	List<DeptVO> deptList();
	void insertDept(DeptVO dept);
	void deleteDept(DeptVO dept);
}