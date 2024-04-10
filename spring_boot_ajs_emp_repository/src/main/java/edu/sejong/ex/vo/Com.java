package edu.sejong.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Com {
	private String rsp;
	public Com(){
		int random = (int)(Math.random()*3) ;
		if(random == 0)this.rsp = "가위";
		if(random == 1)this.rsp = "바위";
		if(random == 2)this.rsp = "보";
	}
	
}
