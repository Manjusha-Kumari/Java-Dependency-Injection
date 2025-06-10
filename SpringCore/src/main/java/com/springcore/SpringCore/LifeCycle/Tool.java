package com.springcore.SpringCore.LifeCycle;

public class Tool {
	private double price;

	public Tool() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tool(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting property");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tool [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
