package com.ref_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ref_injection/referenceconfig.xml");
		First f = (First)context.getBean("first_ref");
		
		//for print particular data
 		System.out.println(f.getX());
		System.out.println(f.getObj().getY());
		
		//for print all data
		System.out.println(f);
		System.out.println("es O/P mai First ka object mila eske ander x mila & obj mila jiske inside Second ka object mila jis obj mai 'y' ki value mili");
	}
}
