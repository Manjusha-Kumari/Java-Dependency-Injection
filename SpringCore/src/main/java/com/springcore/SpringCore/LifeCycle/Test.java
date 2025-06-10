package com.springcore.SpringCore.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SpringCore/LifeCycle/LifeCycleConfig.xml");

		Tool tool = (Tool) context.getBean("tool");
		System.out.println(tool);
		context.registerShutdownHook();
	}

}
