package edu.sejong.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.sejong.ex.service.EmpService;

/**
 * Handles requests for the application home page.
 */
@MapperScan(value="edu.sejong.ex.mapper")
@Controller
public class HomeController {
	
	@Autowired
	EmpService empService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	

	
	
	@GetMapping("/home")
	public String home1() {
		return "index";
	}
	
	@GetMapping("/empList")
	public String empList(Model model) {
		model.addAttribute("emps",empService.empList());
		return "empList";
	}

}
