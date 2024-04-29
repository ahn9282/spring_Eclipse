package edu.sejong.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.mapper.TimeMapper;
import edu.sejong.ex.vo.EmpVO;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	TimeMapper timeMapper;

	@Override
	public List<EmpVO> empList() {
		return timeMapper.empList();
	}

}
