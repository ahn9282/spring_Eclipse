package edu.sejong.ex.vo;

import lombok.Data;

@Data
public class Circle implements Shape{
	private int radius;
	

	public double getArea() {
		double area = (double)Math.PI * Math.pow(radius, 2);
		return area;
	}


	public Circle(int radius) {
		this.radius = radius;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	
}
