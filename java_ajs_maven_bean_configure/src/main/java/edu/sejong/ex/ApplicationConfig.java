package edu.sejong.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //@Component + 설정 의미
public class ApplicationConfig {

	//Indicates that a method produces a bean to be managed by the Spring container
	@Bean // Student student1() = return (new student);
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		
		Student student = new Student("홍길동",20,hobbys);
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}
	@Bean(name= {"student6"})
	public Student student() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("야영");
		hobbys.add("물리");
		
		Student student = new Student("김철수",27,hobbys);
		student.setHeight(150);
		student.setWeight(50);
		
		return student;
	}
	
	@Bean
	public Grade grade() {
		Grade grade = new Grade();
				grade.setKor(90);
				grade.setEng(30);
				grade.setMath(80);
				return grade;
	}
}
