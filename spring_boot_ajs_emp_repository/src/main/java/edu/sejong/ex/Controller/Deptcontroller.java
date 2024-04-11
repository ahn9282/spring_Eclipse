package edu.sejong.ex.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sejong.ex.service.DeptService;
import edu.sejong.ex.vo.DeptVO;

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
	@GetMapping(value = "/lis2")
	public String deptList(Model model) {
		
		System.out.println("list()..");
		model.addAttribute("depts", deptService.deptList());
		
		return "/dept/list";
	}

	@GetMapping(value = "/insert")
	public String insert() {

		return "/dept/insert";
	}

	@PostMapping(value = "/register")
	public String register(@RequestParam("deptno") int deptno, @RequestParam("dname") String dname,
			@RequestParam("loc") String loc, Model model) {
		System.out.println("register()..  ");
		deptService.insert(deptno, dname, loc);

		return "redirect:/dept/list";
	}

	@GetMapping(value = "/delete")
	public String delete(@RequestParam("deptno") int deptno, Model model) {
		System.out.println("delete()..  ");
		deptService.delete(deptno);
		return "redirect:/dept/list";
	}
	@PostMapping(value = "/register2")
	public String register2(DeptVO dept, Model model) {
		System.out.println("register()..  ");
		deptService.insertDept(dept);

		return "redirect:/dept/lis2";
	}


	@GetMapping(value = "/delete2")
	public String delete2(DeptVO dept, Model model) {
		System.out.println("delete()..  ");
		deptService.deleteDept(dept);
		return "redirect:/dept/lis2";
	}
}
