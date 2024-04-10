package edu.sejong.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass5 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ac = new GenericXmlApplicationContext();
		
		ac.load("classpath:appCTX.xml");
		ac.refresh();
		
		  
		  Student student2 = (Student)ac.getBean("student2");
		
		  Student student3 = (Student)ac.getBean("student2");
		  
		  if(student2 == student3) {
			  System.out.println("같습니다.");
		  }else {
			  System.out.println("다릅니다.");
		  }
		
	}

}
