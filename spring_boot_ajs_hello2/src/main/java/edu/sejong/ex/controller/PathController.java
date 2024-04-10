package edu.sejong.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sejong.ex.vo.Circle;
import edu.sejong.ex.vo.Rectangle;
@Controller
@RequestMapping("/path")
public class PathController {


	
	@RequestMapping("/student/{studentId}")
	public String studentID(@PathVariable String studentId, Model model) {
		model.addAttribute("studentId",studentId);
		
		return "student";
	}
	@RequestMapping("/circle/{radius}")
	public String studentID(@PathVariable int radius, Model model) {
		model.addAttribute("circle",new Circle(radius));
		
		return "/shape/circle";
	}
	@RequestMapping("/rectangle/{width}/{height}")
	public String studentID(@PathVariable int width,@PathVariable int height, Model model) {
		model.addAttribute("rectangle",new Rectangle(width,height));
		
		return "/board/rectangle";
	}
}
