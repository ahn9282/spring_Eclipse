package edu.sejong.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sejong.ex.vo.MemberVo;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	
	/*
	 * @RequestMapping("/view") public String memberView(Model
	 * model,HttpServletRequest request) { System.out.println("memberView()...");
	 * model.addAttribute("id",request.getParameter("id"));
	 * model.addAttribute("pw",request.getParameter("pw"));
	 * model.addAttribute("name",request.getParameter("name"));
	 * model.addAttribute("email",request.getParameter("email"));
	 * model.addAttribute("age",request.getParameter("age")); return
	 * "member/register"; }
	 */
	
	@RequestMapping("/register")
	public String register(@ModelAttribute MemberVo memberVo) {
							//어노테이션 생략가능  memberVo  <- Command객체
		return "member/register";
	}
	
	
}
