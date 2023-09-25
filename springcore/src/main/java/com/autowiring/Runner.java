package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowiring/autoconfig.xml");
		
		Emp emp1 = context.getBean("emp1", Emp.class); // yha typecasting karne ki jrurt nahi hai
		System.out.println(emp1);
	}

}
