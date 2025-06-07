package com.springcore.SpringCore.Constructor;

public class Person {
	private String name;
	private int personid;
	private Certificate certi;
	
	public Person(String name, int personid, Certificate certi) {
		this.name = name;
		this.personid = personid;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personid=" + personid + ", certi=" + certi.getName() + "]" ;
	}
}
