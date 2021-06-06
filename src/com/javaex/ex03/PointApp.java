package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point();
		Point p02 = new Point();
	
		p01.setX(5);
		p01.setY(5);
		
		p02.setX(13);
		p02.setY(3);
		
		p01.draw();
		p02.draw();
		
		
		Point p05 = new Point(50, 50);
		
		p05.draw(false);
		
		
	}

}
