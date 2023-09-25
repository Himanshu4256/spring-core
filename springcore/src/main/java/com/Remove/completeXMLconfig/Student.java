package com.Remove.completeXMLconfig;

import org.springframework.stereotype.Component;

@Component("firststudent") //ye hmara object bna dega means bean bnane ki need nahi hai "firststudent" is bean name
public class Student {
	public void study()
	{
		System.out.println("Students are reading Book.");
	}
}