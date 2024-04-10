package edu.sejong.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //@Component + 설정 의미
public class ApplicationConfig3 {
	
	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("헤엄");
		hobbys.add("칼질");
		
		Student student = new Student("지비비",20,hobbys);
		student.setHeight(2014);
		student.setWeight(1.5);
		
		return student;
	}

}
