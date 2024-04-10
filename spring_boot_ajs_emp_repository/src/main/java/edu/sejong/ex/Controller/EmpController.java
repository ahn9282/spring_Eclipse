package edu.sejong.ex.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sejong.ex.service.EmpService;
import edu.sejong.ex.vo.EmpVO;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	EmpService empService;
	
	@RequestMapping("/list")
	public String empList(Model model) {
		List<EmpVO> empList = empService.getList();
		model.addAttribute("emps",empList);
		
		return "/emp/list";
	}
	
	@GetMapping("/add")
	public String addView() {
		return "/emp/add_View";
	}
	
	
	@PostMapping("/add")
	public String addEmp(EmpVO emp) {
		System.out.println(emp);
		
		empService.addEmp(emp);
		return"redirect:/emp/list";
	}
	
	@GetMapping("/remove")
	public String remove(EmpVO emp) {
		System.out.println(emp);
		
		empService.removeEmp(emp);
		return"redirect:/emp/list";
	}
	
}
