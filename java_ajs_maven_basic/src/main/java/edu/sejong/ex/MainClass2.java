package edu.sejong.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainClass2 {
	public static void main(String[] args) {
		String configLocation = "classpath:appCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		
		  System.out.println("나의 이름 : "+myInfo.getName());
		  System.out.println("나의 체중 : "+myInfo.getWeight());
		  System.out.println("나의 키 : "+myInfo.getHeight()); System.out.print("나의 취미 : " + myInfo.getHobbys());
		
		myInfo.getInfo();
		ctx = new GenericXmlApplicationContext("classpath:appCTX3.xml");
		Pencil pencil =(Pencil) ctx.getBean("pencil",Pencil6B.class);
		pencil.use();
		
		ctx = new GenericXmlApplicationContext("classpath:appCTX4.xml","classpath:appCTX5.xml");
		Student student1 = (Student)ctx.getBean("student1");
		System.out.println(student1.getName());
		System.out.println(student1.getHobbys());
		StudentInfo studentInfo = (StudentInfo)ctx.getBean("studentInfo1");
		Student student2  = studentInfo.getStudent();
		
		Student student3 = (Student)ctx.getBean("student2");
		if(student1 == student2) {
			System.out.println("같습");
		}else {
			System.out.println("다름");
		}
		if(student2 == student3) {
			System.out.println("같습");
		}else {
			System.out.println("다름");
		}
		
		 student2 = (Student)ctx.getBean("student2");
		System.out.println(student2.getName());
		System.out.println(student2.getHobbys());
		
	}

}
