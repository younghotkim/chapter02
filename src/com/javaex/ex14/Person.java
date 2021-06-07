package com.javaex.ex14;

public class Person {
	
	protected String name;
	private int age;
	
	public Person () {
		
	}
	
	public Person (String name, int age){
		
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//데이터 확인용
	
	@Override
	public String toString() {
		
		return "Person [name=" + name + ", age=" + age + "]";
		
	}
				
		

	
	
	public void showInfo() { //화면출력용
		
		System.out.println("이름: " + name + " 나이:" + age);
		
	}
	

}
