package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		
		//디폴트 생성자 사용
		Student s1 = new Student();
		
		s1.setName("정우성");
		s1.setAge(50);
		s1.setSchoolName("서울고등학교");
		
		s1.showInfo();
		
		//Student 생성자(3) 사용
		//생성자 순서가 중요 (부모 포함)
		
		/*
		Student s2 = new Student ("이효리", 45, "제주고등학교");
		
		s2.showInfo();
		*/
		
		//상속관계가 있으면 무조건 메모리에 올라가야함
		//아무런 생성자 지시가 없으면 디폴트생성자가 작동됨
		
		/*
		Student s3 = new Student();
		*/
		
		Student s4 = new Student("이효리", 45, "제주고등학교");
		
		s4.showInfo();
		
	}

}
