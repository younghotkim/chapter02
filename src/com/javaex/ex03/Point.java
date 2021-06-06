package com.javaex.ex03;

public class Point {

	private int x;
	private int y;
	
	///////////////////////////////////////
	
	public Point() {
		
	}
	
	
	
	public Point (int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	
	///////////////////////////////////////
	
	public void setX(int x) {
		
		this.x = x;
		
	}
	
	public void setY(int y) {
		
		this.y = y;
		
	}
	
	public int getX() {
		
		return x;
		
	}
	
	public int getY() {
		
		return y;
		
	}
	
	
	public void draw() {
		
		System.out.println("점[x= "+ x + ", y= " + y + "]을 그렸습니다.");
		
	}
	///////////////////////////////////////////
	
	public void draw(boolean flag) {
		
		if(flag == true) {
			System.out.println("점[x= "+ x + ", y= " + y + "]을 그렸습니다.");
		} else {
			System.out.println("점[x= "+ x + ", y= " + y + "]을 지웠습니다.");
		}
		
	}
	
	
}
