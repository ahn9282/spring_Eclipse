package edu.sejong.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.sejong.ex.vo.EmpVO;

@Service
public interface EmpService {
	public List<EmpVO> empList();
}
