package edu.sejong.ex;

public class Circle implements Shape{
	private int radius;
	

	public void getArea() {
		double area = (double)Math.PI * Math.pow(radius, 2);
		System.out.println("넓이는 "+ area+ "입니다.");
	}


	public Circle() {
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	
}
