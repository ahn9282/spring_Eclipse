package edu.sejong.ex;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import lombok.Data;

@Data
public class TestFormat {
	
	
	TestFormat(int num, LocalDateTime time){
		this.localDateTime = time;
		this.number = num;
	}
	
	@NumberFormat(pattern = "###,###")
	private Integer number;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss 시간")
	private LocalDateTime localDateTime;
	
}
