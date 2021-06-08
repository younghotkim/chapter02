package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("빨강","검정",5,5);
		Rectangle r02 = new Rectangle("노랑","검정",6,6);
		Rectangle r03 = new Rectangle("초록","검정",7,7);
		
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		
		//배열을 이용한 그리기
		for(int i=0; i<rArray.length; i++) {
			
			rArray[i].draw();
			
		}
		
		//배열을 이용하여 배경생 변경
		for (int i=0; i<rArray.length; i++) {
			
			rArray[i].setBackgroundColor("핑크");
			
		}
		
		for(int i=0; i<rArray.length; i++) {
			
			rArray[i].draw();
			
		}
		
		Circle[] cArray = new Circle[3];
		
		Circle c1 = new Circle("빨강","검정",5);
		Circle c2 = new Circle("파랑","검정",7);
		Circle c3 = new Circle("초록","검정",9);
		
		cArray[0] = c1;
		cArray[1] = c2;
		cArray[2] = c3;
		
		
		for (int i=0;i<cArray.length;i++) {
			
			cArray[i].draw();
			
		}

	}

}
