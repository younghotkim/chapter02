package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		computer.setName("그램");
		computer.setPrice(20000000);
		
		cup.setName("머그컵");
		cup.setPrice(4000);
		
		
		computer.showInfo();
		cup.showInfo();
		
		
		//생성자는 1번만 사용 할 수 있다
		//즉, 메모리에 올리는 역할을 한번만 한다.
		
		Goods camera = new Goods("니콘", 200000);
		camera.showInfo();
		
		
		
		

	}

}
