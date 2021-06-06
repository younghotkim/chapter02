package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		
		//int[] intArray = new int[3];
		
		Goods[] goodsArray = new Goods[4];
		
		//배열 만들기
		
		
		Goods computer = new Goods("그램", 1000000);
		computer.showInfo();
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(4000000);
		camera.showInfo();
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
		
		Goods snack = new Goods();
		snack.setName("Ray's");
		snack.setPrice(2000);
		snack.showInfo();
		
		
		/////////////////////////////////////////////
		//배열 넣기
		
		goodsArray[0] = computer;
		goodsArray[1] = camera;
		goodsArray[2] = cup;
		goodsArray[3] = snack;
		
		//computer.getName(); = goodsArray[0].getName();
		
		System.out.println("////////////////////////////");
		
		int count=0;
		for (int i=0; i<goodsArray.length; i++) {
			
			if(goodsArray[i] !=null) {
			//배열에 주소가 없지 않으면(있으면)
			
				count =  count + 1;
				goodsArray[i].showInfo();
			}
	
		}
		
		System.out.println(count + "개");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
