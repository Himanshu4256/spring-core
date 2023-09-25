package com.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/standalone/collections/standaloneconfig.xml");
		
		Person2 per = context.getBean("person", Person2.class);
		System.out.println(per);
		System.out.println(per.getFriends().getClass().getName());
		System.out.println("########################################");
		System.out.println(per.getFeeStruct());
		System.out.println(per.getFeeStruct().getClass().getName());
	}

}