package edu.sejong.ex.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.sejong.ex.vo.EmpVO;


@Mapper
public interface EmpMapper{
	
	List<EmpVO> empList();
	
	void insertEmp(EmpVO emp);
	
	void deleteEmp(EmpVO emp);
}