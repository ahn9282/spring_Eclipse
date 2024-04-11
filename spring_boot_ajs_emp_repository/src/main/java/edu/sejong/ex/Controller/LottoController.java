package edu.sejong.ex.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sejong.ex.service.LottoService;
import edu.sejong.ex.service.RspService;
import edu.sejong.ex.vo.Com;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/game")
public class LottoController {
	
	@Autowired
	LottoService service;
	
	@GetMapping("/start")
	public String start(Model model) {
		System.out.println("start()..");
		
		model.addAttribute("lotto",service.start());
		return "/game/lotto";
	}
	
}
