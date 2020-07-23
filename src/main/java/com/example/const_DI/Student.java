package com.example.const_DI;

public class Student {
	private int rollno;
	private String name;
	private Address address;
	
	public Student() {
		System.out.println("In the Student default constructor");
	}

	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	void display() {
		
		System.out.println(rollno+""+name);
		System.out.println(address.toString());
		
	}
	
	
	
	

}
