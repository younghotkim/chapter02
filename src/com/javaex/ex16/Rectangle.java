package com.javaex.ex16;

public class Rectangle {
	
	protected String backgroundColor;
	protected String borderColor;
	private int width;
	private int height;
	
	public Rectangle () {
		
	}
	
	public Rectangle(String backgroundColor, String borderColor, int width, int height) {
		
		this.backgroundColor=backgroundColor;
		this.borderColor=borderColor;
		this.width=width;
		this.height=height;
		
	}
	
	
	
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public String getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
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
	
	
	@Override
	public String toString() {
		
		return "Rectangle=[backgroundColor=" + backgroundColor + "borderColor= " + borderColor + "width= " + width + "height= " + height + "]";
		
	}
	
	public void draw() {
		
		System.out.println("배경색: " + backgroundColor + "테두리색: " + this.borderColor + "가로: " + width + "세로: " + height + " 사각형 을 그렸습니다.");
		
	}

	
	
	
	

}
