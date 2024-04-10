package edu.sejong.ex.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.repository.DeptRepository;
import edu.sejong.ex.vo.DeptVO;

@Service // @Component + 의미(Command) = 비즈니스 로직
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptRepository deptRepository;


	@Override
	public List<DeptVO> getList() {
		List<DeptVO> serviceList = deptRepository.selectList();
		return serviceList;
	}



	@Override
	public void insert(int deptno, String dname, String ioc) {
		deptRepository.insert(deptno, dname, ioc);
	}



	@Override
	public void delete(int deptno) {
		deptRepository.delete(deptno);	
	}


	
}
