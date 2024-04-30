package edu.sejong.ex.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.mapper.DeptMapper;
import edu.sejong.ex.vo.DeptVO;


@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	DeptMapper deptMapper;
	
	public List<DeptVO> getDeptList(){
		return deptMapper.getDeptList();
	}
}
