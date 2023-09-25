package com.Remove.completeXMLconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("firststudent",Student.class);
		student.study();
		
//------------------------------------------------------------------------------------------------		
		System.out.println("Here @Component work remove @Bean Work start...");
		
		ApplicationContext c2 = new AnnotationConfigApplicationContext(RmveCmpontAnno_JavaConfig.class);
		Student2WoutComponent s2 = c2.getBean("temp",Student2WoutComponent.class);
		s2.understing();
		
		
	}
}
