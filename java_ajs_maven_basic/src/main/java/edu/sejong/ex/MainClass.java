package edu.sejong.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainClass {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setFirstNum(10);
		calculator.setSecondNum(15);
		calculator.addition();
		calculator.subtraction();

		String configLocation = "classpath:appCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		calculator = ctx.getBean("calculator", Calculator.class);
		System.out.println(calculator);
		calculator.setFirstNum(10);
		calculator.setSecondNum(10);
		calculator.addition();
		System.out.println("calculator : " + calculator);

		MyCalculator myCalculator = (MyCalculator) ctx.getBean("myCalculator", MyCalculator.class);
		System.out.println("myCalculator : " + myCalculator);
		System.out.println("myCalculator's calculator : " + myCalculator.getCalculator());
		System.out.println("myCalculator's firstNum : " + myCalculator.getFirstNum());
		System.out.println("myCalculator's secondNum : " + myCalculator.getSecondNum());
		myCalculator.add();
		myCalculator.sub();

		System.out.println();
		MyCalculator myCalculator2 = (MyCalculator) ctx.getBean("myCalculator", MyCalculator.class);
		System.out.println("myCalculator2 : " + myCalculator2);
		System.out.println("myCalculator2's calculator : " + myCalculator2.getCalculator());

		Grade myGrade = (Grade) ctx.getBean("grade", Grade.class);
		System.out.println("Grade : " + myGrade);
		System.out.println("Grade's calculator : " + myGrade.getCalculator());
		System.out.println(myGrade.total());
		System.out.println(myGrade.average());
		System.out.println(myGrade.getGrade());
		
		myGrade.setEng(90);
		myGrade.setKor(90);
		myGrade.setMath(90);
		System.out.println(myGrade.total());
		System.out.println(myGrade.average());
		System.out.println(myGrade.getGrade());
		
	}

}
