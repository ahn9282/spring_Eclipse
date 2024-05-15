package edu.sejong.ex;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FormatterTest {
	
	@Test
	void formatterTest(){
		
		int mn = 10000;
		
		LocalDateTime now = LocalDateTime.now();
		
		
		TestFormat tf = new TestFormat(mn, now);
		log.info("money is {}", tf.getNumber());
		log.info("time is {}", tf.getLocalDateTime());
		
	}

}
