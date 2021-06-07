package com.javaex.ex13;

public class PersonApp {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setName("정우성");
		s.setAge(50);
		s.setSchoolName("서울고등학교");
		
		s.showInfo();
		
		Person p = new Person();
		
		p.setName("이효리");
		p.setAge(40);
		
		p.showInfo();
		
		
	}

}
