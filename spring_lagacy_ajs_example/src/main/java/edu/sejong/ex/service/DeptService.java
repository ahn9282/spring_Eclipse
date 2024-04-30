package edu.sejong.ex.service;


import java.util.List;

import org.springframework.stereotype.Service;

import edu.sejong.ex.vo.DeptVO;


@Service
public interface DeptService {
	public List<DeptVO> getDeptList();
}
