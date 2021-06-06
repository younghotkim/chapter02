package com.javaex.ex06;

public class Point {
	
	int x;
	int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public Point(int x) {
		this.x = x;
	}
	
	
	/*public Point(int y) {
		this.y = y;
	}*/
	
	////parameter의 자료형이 같으면 구분못함!!!
	
	///////////////////////////
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}

	public void draw() {
		
		System.out.println("점[x= "+ x + ", y= " + y + "]을 그렸습니다.");
		
	}
	
}
