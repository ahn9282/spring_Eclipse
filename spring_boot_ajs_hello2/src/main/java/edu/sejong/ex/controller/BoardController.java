package edu.sejong.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.sejong.ex.vo.Grade;
import edu.sejong.ex.vo.Rectangle;

@Controller
public class BoardController {

	@RequestMapping(value="/board", method=RequestMethod.GET)
	public String board() {
		
		System.out.println("board()...찍힘");
		return "board";
		
	}
	
	
	@RequestMapping(value="/board/view")
	public String view() {
		return "board/view";
		
	}
	
	@RequestMapping(value="/board/content")
	public void content(Model model, Locale locale) {
		System.out.println("board/content().. 찍힘");
		model.addAttribute("id",30);
		model.addAttribute("age",320);
		model.addAttribute("name","홍길동");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		
		}
	
	
	@RequestMapping(value="/board/reply")
	public ModelAndView reply(ModelAndView mv) {
		
		//ModelAndView mv = new ModelAndView();
		mv.addObject("id",30);
		mv.setViewName("board/reply");
		
		return mv;
		
	}
	
	@RequestMapping(value="/board/grade")
	public ModelAndView grade(ModelAndView mv, Grade grade) {
		//Grade grade = new Grade(80,97,43);
		grade.setEng(90);
		grade.setKor(87);
		grade.setMath(92);
		mv.addObject("grade", grade);
		
		mv.setViewName("board/grade");
		
		return mv;
	}
	@RequestMapping(value="/board/rectangle")
	public ModelAndView rectangle(ModelAndView mv, Rectangle rectangle) {
		//Grade grade = new Grade(80,97,43);
		
		rectangle.setWidth(87);
		rectangle.setHeight(92);
		mv.addObject("rectangle", rectangle);
		
		mv.setViewName("board/rectangle");
		
		return mv;
	}
}
