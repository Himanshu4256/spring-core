package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerS {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/stereotype/stereoconfig.xml");
		Student student = context.getBean("ob",Student.class);
		System.out.println(student);
		System.out.println(student.getAddresses());
	}

}
