package com.springcore.SpringCore.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// since this configuration file used here is not directly under the java directory
		// we need to specify its exact location
		// as this only finds configuration files directly in the java directory
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SpringCore/Reference/ReferenceConfig.xml");
        
        A a = (A) context.getBean("aref");
        System.out.println(a);
        
        B b = (B) context.getBean("bref");
        System.out.println(b);
	}

}
