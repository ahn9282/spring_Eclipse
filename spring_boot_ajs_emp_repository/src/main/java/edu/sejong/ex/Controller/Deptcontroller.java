package edu.sejong.ex.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sejong.ex.service.DeptService;

@Controller
@RequestMapping("/dept")
public class Deptcontroller {

	@Autowired
	private DeptService deptService;

	@GetMapping(value = "/list")
	public String board(Model model) {

		System.out.println("list()..");
		model.addAttribute("depts", deptService.getList());

		return "/dept/list";
	}

	@GetMapping(value = "/insert")
	public String insert() {

		return "/dept/insert";
	}

	@PostMapping(value = "/register")
	public String register(@RequestParam("deptno") int deptno, @RequestParam("dname") String dname,
			@RequestParam("ioc") String ioc, Model model) {
		System.out.println("register()..  ");
		deptService.insert(deptno, dname, ioc);

		return "redirect:/dept/list";
	}

	@GetMapping(value = "/delete")
	public String register(@RequestParam("deptno") int deptno, Model model) {
		System.out.println("delete()..  ");
		deptService.delete(deptno);
		return "redirect:/dept/list";
	}
	
	
}
