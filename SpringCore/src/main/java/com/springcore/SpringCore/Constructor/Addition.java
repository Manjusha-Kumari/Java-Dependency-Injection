package com.springcore.SpringCore.Constructor;

public class Addition {
	// to show an example for ambiguity problem with dependency injection using constructor
	// it arises when spring is not able to distinguish between the data type of the parameter passed on its own 
	// and we then needs to specify it using the type attribute in there
	
	private int a;
	private int b;
	
	// what spring does is it reads the the value passed in the constructor arg default as a string 
		// but then it checks there is no constructor that takes in string string as params then it checks the code
		// from up to down and choses the first matched and use it 
		// so when we have int : int constructor declared first it will always use int : int constructor to inject
		// if we change the order to double : double first then it will always use double double constructor to inject
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		// this print statement is added inside every constructor to show what constructor is used by spring for injection
		System.out.println("Constructor : int : int");
	}
	
	public Addition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor : double : double");
	}
	
	// since we have a String : String constructor now it will always call this constructor while injection
	// since the default type considered by spring of the parameters is always String 
	// so this is the ambiguity problem where spring is not able to understand what constructor to use while injection
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String : String");
	}
	
	public void doSum() {
		System.out.println("Value of a : " + this.a);
		System.out.println("Value of b : " + this.b);
		System.out.println("Sum is : " + (this.a + this.b));
	}
}
