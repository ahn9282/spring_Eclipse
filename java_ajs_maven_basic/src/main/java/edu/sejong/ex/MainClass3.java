package edu.sejong.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainClass3 {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX6.xml");
		    Shape pencil = (Shape) ctx.getBean("Shape");
		    pencil.getArea();
		    Shape rectangle = (Shape) ctx.getBean("Shape1");
		    pencil.getArea();
		    Shape triangle = (Shape) ctx.getBean("Shape2");
		    pencil.getArea();
		
	}

}
