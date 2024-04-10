package edu.sejong.ex;

/**
 * Hello world!
 *
 */
public class Calculator {
	private int firstNum;
	private int secondNum;
	

	
	public Calculator() {
		

	}

	public Calculator(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		

	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void addition() {
		System.out.println("addition()..");
		int result = firstNum + secondNum;
		System.out.println(firstNum + " + " + secondNum + " = " + result);
	}

	public void subtraction() {
		System.out.println("subtraction()..");
		int result = firstNum - secondNum;
		System.out.println(firstNum + " - " + secondNum + " = " + result);
	}
}
