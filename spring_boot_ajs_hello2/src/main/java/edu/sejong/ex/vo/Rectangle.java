package edu.sejong.ex.vo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Shape{
	private int width;
	private int height;
	

	public double getArea() {
		double area = width * height;
	return area;
	}


	public Rectangle() {
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	
}
