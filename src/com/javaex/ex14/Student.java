package com.javaex.ex14;

public class Student extends Person {

	private String schoolName;

	
	/* case1 부모의 Person(2) 생성자 사용
	 
	 
	public Student (String name, int age, String schoolName) {
		
		super(name, age);
		this.schoolName = schoolName;
		
	} */
	
	public Student (String name, int age, String schoolName) {
		
		super.setName(name);
		super.setAge(age);
		this.schoolName = schoolName;
		
	}
	
	
	public Student() {
		
	}

	

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		
		this.schoolName = schoolName;
		
	}
	
	public String toString() {
		
		return "Student [schoolName =" + schoolName + "]";
		
	}
	
	public void showInfo() {
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + getAge());
		System.out.println("학교: " + getSchoolName());
	}

}
