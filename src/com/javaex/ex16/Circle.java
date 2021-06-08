package com.javaex.ex16;

public class Circle extends Rectangle {
	
	/*  
	private String backgroundColor;
    private String borderColor;
	private int width;
	private int height;
	*/
	
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(String backgroundColor, String borderColor, int radius) {
		
		super.backgroundColor=backgroundColor;
		super.borderColor=borderColor;
		this.radius=radius;
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		
		return "Circle=[backgroundColor=" + super.backgroundColor + "borderColor= " + super.borderColor + "radius= " + radius + "]";
		
	}
	
	public void draw() {
		
		System.out.println("배경색: " + super.backgroundColor + "테두리색: " + super.borderColor + "반지름: " + radius + "인 원을 그렸습니다.");
		
	}
	
	
	

}
