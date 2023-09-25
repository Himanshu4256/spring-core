package com.springbeanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springbeanlifecycle/LCconfig.xml");
		//- AbstractApplicationContext - for registering shutdown hook jb aap destroy mtd use kroge to Hook method esi m milega
		LifecycleUsingXml s = (LifecycleUsingXml)context.getBean("A1");
		System.out.println(s);
		context.registerShutdownHook(); // for destroy the process and (ye sabhi must k liye types hai)
		
		
		// For Actual output of 'LifecycleUsingInterfaces', 'LifecycleUsingXml' k code&bean ko comment kro wrna o/p aage piche aaega
		System.out.println("--------------------------------------------------------");
		LifecycleUsingInterfaces l = (LifecycleUsingInterfaces)context.getBean("B1");
		System.out.println(l);
		
		System.out.println("--------------------------------------------------------");
		LifecycleUsingAnnotations l1 = (LifecycleUsingAnnotations)context.getBean("C1");
		System.out.println(l1);
	}

}