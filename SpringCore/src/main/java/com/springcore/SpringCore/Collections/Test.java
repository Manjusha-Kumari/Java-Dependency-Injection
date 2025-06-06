package com.springcore.SpringCore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// since this configuration file used here is not directly under the java directory
		// we need to specify its exact location
		// as this only finds configuration files directly in the java directory
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SpringCore/Collections/CollectionConfig.xml");
        
        Employee employee1 = (Employee) context.getBean("Employee1");
        System.out.println(employee1);

	}

}
