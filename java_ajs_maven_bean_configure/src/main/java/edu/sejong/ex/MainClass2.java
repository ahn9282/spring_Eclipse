package edu.sejong.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass2 {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:appCTX.xml");
		
		 Student student2 = (Student)ac.getBean("student2");
		  System.out.println("이름 : " + student2.getName() + "입니다.");
		 System.out.println("나이: " + student2.getAge() + "입니다.");
		  System.out.println("취미 : " + student2.getHobbys() + "입니다.");
		  System.out.println("신장: " + student2.getHeight() + "입니다.");
		  System.out.println("몸무게 : " + student2.getWeight() + "입니다.");
		  
		  Student student1 = (Student)ac.getBean("student1",Student.class);
		  System.out.println("이름 : " + student1.getName() + "입니다.");
			 System.out.println("나이: " + student1.getAge() + "입니다.");
			  System.out.println("취미 : " + student1.getHobbys() + "입니다.");
			  System.out.println("신장: " + student1.getHeight() + "입니다.");
			  System.out.println("몸무게 : " + student1.getWeight() + "입니다.");
		
	}

}
