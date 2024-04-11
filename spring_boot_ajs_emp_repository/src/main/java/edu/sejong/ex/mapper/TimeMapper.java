package edu.sejong.ex.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.sejong.ex.vo.DeptVO;

@Mapper
public interface TimeMapper{
	
	@Select("select sysdate from dual")
	public String getTime();
		
	@Select("select 1+1 from dual")
	public String getOnePlusOne();
	
	@Select("select empno from emp order by empno")
	public List<String> getEmpEmpno();
	
	@Select("select * from dept")
	public List<DeptVO> getDept();
	
	public String getTime2();
	
	public String getOnePlusOne2();
}