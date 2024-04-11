package edu.sejong.ex.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.repository.DeptRepository;
import edu.sejong.ex.repository.EmpRepository;
import edu.sejong.ex.vo.DeptVO;
import edu.sejong.ex.vo.EmpVO;
import edu.sejong.ex.vo.LottoVO;
import lombok.extern.slf4j.Slf4j;

@Service 
public class LottoServiceImpl implements LottoService {

	@Override
	public LottoVO start() {
		return new LottoVO();
	}	
	
}
