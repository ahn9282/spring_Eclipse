package edu.sejong.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.sejong.ex.service.DeptService;
import edu.sejong.ex.vo.DeptVO;
import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */
@Slf4j
@Controller
public class DeptController {
	
	@Autowired
	DeptService deptService;
	
	@GetMapping("/dept")
	public String deptList(Model model) {
		
		List<DeptVO> list = deptService.getDeptList();
		model.addAttribute("emps", list);
		return "deptList";
	}

}
