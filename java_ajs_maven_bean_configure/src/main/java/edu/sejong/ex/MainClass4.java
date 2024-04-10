package edu.sejong.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass4 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ac = new GenericXmlApplicationContext();
		
		ac.load("classpath:appCTX.xml");
		ac.refresh();
		
		  
		  Student student1 = (Student)ac.getBean("student1",Student.class);
		  System.out.println("이름 : " + student1.getName() + "입니다.");
			 System.out.println("나이: " + student1.getAge() + "입니다.");
			  System.out.println("취미 : " + student1.getHobbys() + "입니다.");
			  System.out.println("신장: " + student1.getHeight() + "입니다.");
			  System.out.println("몸무게 : " + student1.getWeight() + "입니다.");
		
			  ac.close();
	}

}
