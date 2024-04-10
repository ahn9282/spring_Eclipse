package edu.sejong.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sejong.ex.vo.Student;
@Controller
public class StudentController {

	@RequestMapping(method = RequestMethod.GET,value = "/student")
	public String Student(@RequestParam("id")String id, Model model ) {
		model.addAttribute("student",new Student(id));
		return"/student/studentInfo";
	}
	
	@RequestMapping("/student/view")
	public String view() {
		System.out.println("view()..");
		
		return "student/student";
	}

}
