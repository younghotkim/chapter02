package com.javaex.ex02;

public class Goods {

	
	//필드
	private String name;
	private int price;
	
	//메소드-겟터셋터
	
	//메소드-일반
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	
	public void setPrice(int price) {
		
		if (price<0) {
			this.price=0;
		}
		else {
			this.price = price;
		}
		
	}
	
	
	
	
	
	public String getName() {
		
		return name;
		
	}
	
	
	public int getPrice() {
		
		if(this.price<0) {
			
			return 0;
			
		} else {
			
		return price;
		
		}
		
	}
	
	public void showInfo() {
		
		System.out.println("상품 이름: " + name);
		System.out.println("상품 가격: " + price);
	}
	
	
	
	
}
