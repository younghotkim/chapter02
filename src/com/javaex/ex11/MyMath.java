package com.javaex.ex11;

public class MyMath {
	
	private static double pi = 3.14;
	
	//필드
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	
	public static int plus(int a, int b) {
		
		int result = a + b;
		
		return result;
	}
	
	public double plus(double a, double b) {
		double result = a + b;
		return result;
	}

	public double plus (double a, int b) {
		double result = a + b;
		return result;
	}
	
	public static double circleArea (int radius) {
		double result = radius * radius * pi;
		return result;
		
	}
	
	
	}


