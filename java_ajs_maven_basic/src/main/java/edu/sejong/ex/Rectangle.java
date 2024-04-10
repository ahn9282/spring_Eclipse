package edu.sejong.ex;

public class Rectangle implements Shape{
	private int width;
	private int height;
	

	public void getArea() {
		int area = width * height;
		System.out.println("넓이는 "+ area+ "입니다.");
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
