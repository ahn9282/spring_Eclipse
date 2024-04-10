package edu.sejong.ex.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import edu.sejong.ex.vo.Circle;
import edu.sejong.ex.vo.Rectangle;

@Controller
@RequestMapping("/shape")
public class ShapeController {

	
	@RequestMapping("/rectangle")
	public ModelAndView rectangle(ModelAndView mv) {
		//Grade grade = new Grade(80,97,43);
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(87);
		rectangle.setHeight(92);
		mv.addObject("rectangle", rectangle);
		
		mv.setViewName("board/rectangle");
		
		return mv;
	}
	@GetMapping("/circle")
	public String circle(@RequestParam("radius")int radius ,Model model) {
		System.out.println("circle()이 찍힘");
		Circle circle = new Circle(radius);
		circle.setRadius(radius);
		
		model.addAttribute("circle",circle);
		
		return "/shape/circle";
		
	}
	@RequestMapping
	public ModelAndView shape(HttpServletRequest request, ModelAndView mv) {
		System.out.println("shape()..");
		mv.setViewName("/shape/shape");
		return mv;
	}
	
	@RequestMapping("/rectangle1")
	public String rectangle1( Rectangle rectangle) {
		//Grade grade = new Grade(80,97,43);
		
		
		return "/board/rectangle";
	}
	
}
