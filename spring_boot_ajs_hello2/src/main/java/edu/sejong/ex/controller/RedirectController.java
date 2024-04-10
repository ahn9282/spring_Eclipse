package edu.sejong.ex.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RedirectController {

	@RequestMapping("/redirect/check")
	public String redirectCheck(@RequestParam("id")String id,Model model) {
		
		if(id.equals("abcde"))
			return "redirect:/studentOK";
		System.out.println("redirectCheck()...찍힘");
		model.addAttribute("id",id);
		return "forward:/studentNg";

	}
	
	@RequestMapping("/studentOK")
	public String studentOk() {
		System.out.println("studentOk()..");
		
		return"/student/studentOk";	
		}
	@RequestMapping("/studentNg")
	public String studentNg() {
		System.out.println("studentNg()..");
		
		return"/student/studentNg";	
	}
	
}
