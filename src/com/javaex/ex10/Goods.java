package com.javaex.ex10;

public class Goods {

	//////////////////field///////////////////////
	
	private String name;
	private int price;	

	
	///////////////Constructor//////////////////////
	
	public Goods() {
	
		
	}

	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	/////////////////Getter Setter////////////////////
	
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
	
	
	//////////////////Method///////////////////////////

	public void showInfo() {

		System.out.println("상품 이름: " + name);
		System.out.println("상품 가격: " + price);
		
		System.out.println("=======================");
	}

}
