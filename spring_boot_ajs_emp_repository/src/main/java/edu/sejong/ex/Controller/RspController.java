package edu.sejong.ex.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sejong.ex.service.RspService;
import edu.sejong.ex.vo.Com;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/game")
public class RspController {
	
	@Autowired
	RspService service;
	
	@GetMapping("/rsp")
	public String gameRSP() {
		return"/game/rsp_game";
	}
	@PostMapping("/rsp")
	public String resultRsp(@RequestParam("rsp") String value, Model model) {
		Com com = new Com();
		String result = service.resultGame(value, com);
		log.info("나의 값 : {}, 컴퓨터 : {}, 결과 : {}",value,com.getRsp(),result);
		model.addAttribute("com",com);
		model.addAttribute("result",result);
		return"/game/rsp_game";
	}
}
