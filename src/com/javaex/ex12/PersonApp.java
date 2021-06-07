package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p = new Person("정우성", 46);
		p.showInfo();
		
		System.out.println(p.toString());
		
		p.setAge(50);
		System.out.println(p.getAge());
		
		
		Student s = new Student("이효리", 40, "제주고등학교");
		
		System.out.println(s.toString());
		
	
	}

}
