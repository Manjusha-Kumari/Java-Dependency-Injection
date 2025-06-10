package com.springcore.SpringCore.LifeCycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

// Bean lifeCycle methods using interface
public class Food implements InitializingBean, DisposableBean {
	private double price;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting property : price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Food [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("taking food : init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Finished food : destroy");
	}
}
