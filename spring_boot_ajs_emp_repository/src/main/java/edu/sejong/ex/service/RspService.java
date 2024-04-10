package edu.sejong.ex.service;

import org.springframework.stereotype.Service;

import edu.sejong.ex.vo.Com;

@Service
public class RspService {



	public String resultGame(String value, Com com) {
		if(value.equals(com.getRsp())) {
			return"비겼습니다.";
		}else if((value.equals("가위") && com.getRsp().equals("보"))||
				(value.equals("바위") && com.getRsp().equals("가위"))||
				(value.equals("보") && com.getRsp().equals("바위"))) {
			return "이겼습니다.";
		}else if((value.equals("바위") && com.getRsp().equals("보"))||
				(value.equals("보") && com.getRsp().equals("가위"))||
				(value.equals("가위") && com.getRsp().equals("바위"))) {
			return "졌습니다.";
		}
		return "";
	}

}