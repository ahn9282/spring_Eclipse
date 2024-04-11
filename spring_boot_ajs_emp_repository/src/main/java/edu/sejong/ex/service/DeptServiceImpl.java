package edu.sejong.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.mapper.DeptMapper;
import edu.sejong.ex.repository.DeptRepository;
import edu.sejong.ex.vo.DeptVO;

@Service // @Component + 의미(Command) = 비즈니스 로직
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	@Autowired
	private DeptRepository deptRepository;


	@Override
	public List<DeptVO> getList() {
		List<DeptVO> serviceList = deptRepository.selectList();
		return serviceList;
	}



	@Override
	public void insert(int deptno, String dname, String loc) {
		deptRepository.insert(deptno, dname, loc);
	}



	@Override
	public void delete(int deptno) {
		deptRepository.delete(deptno);	
	}
	@Override
	public List<DeptVO> deptList() {
		List<DeptVO> serviceList = deptMapper.deptList();
		return serviceList;
	}
	@Override
	public void insertDept(DeptVO deptVO) {
		deptMapper.insertDept(deptVO);
		
	}
	@Override
	public void deleteDept(DeptVO deptVO) {
		// TODO Auto-generated method stub
		deptMapper.deleteDept(deptVO);
	}


	
}
