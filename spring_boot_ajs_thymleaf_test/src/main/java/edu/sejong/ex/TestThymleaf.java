package edu.sejong.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/tl")
public class TestThymleaf {

	@Autowired
	MailService mailService;
	
	@GetMapping("/test1")
	public String thTest(Model model) {
		TestTh test  = new TestTh("name",5, true);
		
		log.info("test's name = {} , number = {}", test.getName(),test.getNum());
		model.addAttribute("test",test);
		
		return "test";
	}
	
	
	
	@GetMapping("/mailgg1")
	   public String MailPage(){
        return "Mail1";
    }
	
	@PostMapping("/mailgg1")
	public void MailSend(MailVo mailVo) {
		mailService.CreateMail(mailVo);
	}
	
	
}
