package com.javaex.ex21;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] intArray = new int[3];
		
		intArray[0] = 0;
		
		intArray[1] = 1;
		
		intArray[2] = 2;
		
		try { System.out.println(intArray[3]);
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의범위를 벗어났습니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("null");
		}
		
		  finally {
			System.out.println("종료");
		}
		
		

	}

}
