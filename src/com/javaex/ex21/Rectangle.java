package com.javaex.ex21;

public class Rectangle {

	//필드
	private int width;
	private int height;
	
	//생성자

	public Rectangle() {
		//super();      // Shape() --> 표기는 super()
		//System.out.println("Rectangle()");
		
	}

	public Rectangle(int width, int height) {
		//super();      // Shape() --> 표기는 super()
		
		this.width = width;
		this.height = height;
		//System.out.println("Rectangle(4)");
		
	}


	//메소드-gs
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

	//메소드-일반
	

	
	
	public void draw() {
		System.out.println("[가로:" + width + ", 세로:" + height + 
				           "] 사각형을 그렸습니다. " );
	}
	
	
	public double area() {
		return width*height;
	}
	
	
}