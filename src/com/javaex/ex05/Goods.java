package com.javaex.ex05;

public class Goods {

	//필드
	
	//필드로 뭐쓸지 선언해주기~~
	
	private String name;
	private int price;
	
//	public void setName(String name) {
//		
//		this.name = name;
//		
//	}
//	
//	public void setPrice(int price) {
//		
//		this.price = price;
//		
//	}
//	
//	public String getName() {
//		
//		return name;
//		
//	}
//
//	public int getPrice() {
//		
//		return price;
//		
//	}
	
	//생성자 return형이 없다
	
	//권한 + 클래스이름 + 기본형괄호
	
	public Goods() {
		
	}	 //default 생성자 
	// 다른 생성자가 생기면 안생긴다 
	// Goods를 메모리에 올려놓는 역할*생성자*
	
	
	public Goods (String name, int price) {
		//Goods를 메모리에 올려놓는 역할*생성자*
		this.name = name;
		this.price = price;	
	}
	
	
	
	public void showInfo() {
		
		System.out.println("상품이름: " + name);
		System.out.println("상품가격: " + price);
		
	}

	
	//Getter Setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	///////////////////////////////

	
	
}


