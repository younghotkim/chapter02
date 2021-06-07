package com.javaex.ex15;

public class Point {
	
	protected static int x;
	protected static int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		
		Point.x = x;
		Point.y = y;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		Point.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		Point.y = y;
	}
	
	public void showInfo() {
		
		System.out.println("x: " + x + "y: " + y);
		
	}
	
}
