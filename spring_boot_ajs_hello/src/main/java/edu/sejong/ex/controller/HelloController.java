package edu.sejong.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/")
	public String hello() {
		return "<h1>Hello world!! 안녕하세요 <h1>";
	}
	@GetMapping("/hello")
	public String hello2() {
		return "<h1>HelloX2 world!! 안녕하세요X2 <h1>";
	}
	@GetMapping("/human")
	public String human() {
		return "<h1>나는 사람입니다. <h1>";
	}
	@GetMapping("/person")
	public String person() {
		return "<h1>나는 홍길동입니다. <h1>";
	}

	
}
