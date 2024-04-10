package edu.sejong.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("home()..");
		return "home";
	}
	
	@GetMapping("/home1")
	public String home1() {
		System.out.println("home1()..");
		return "home1";
	}
	@GetMapping("/go")
	public String go() {
		System.out.println("go()..");
		return "go";
	}
	@GetMapping("/go2")
	public String go2() {
		System.out.println("go2222()..");
		return "hello";
	}
}
