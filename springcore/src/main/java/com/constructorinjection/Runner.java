package com.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("com/constructorinjection/CIconfig.xml");
		Person p = (Person)context.getBean("person"); // person- is bean name
		
		System.out.println(p);
		
		AmbiguityProblem ambg = (AmbiguityProblem)context.getBean("amb");
		ambg.doSum();		
	}
}
