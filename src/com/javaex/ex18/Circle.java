package com.javaex.ex18;

public class Circle extends Shape{

	//필드
	private int radius;

	//생성자
	public Circle() {
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	//메소드-gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//메소드-일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + 
				           ", 반지름:" + radius + "] 원을 그렸습니다. " );
	}
	
	public double area() {
		return radius*radius*3.14;
	}
	
	
}