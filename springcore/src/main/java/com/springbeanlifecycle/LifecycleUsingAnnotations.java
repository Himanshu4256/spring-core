package com.springbeanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifecycleUsingAnnotations {
	private String subject;

	@Override
	public String toString() {
		return "LifecycleUsingAnnotations [subject=" + subject + "]";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	@PostConstruct		// en notations k liye dependency dalni padegi bcoz ye purane javaEE k hai.
	public void init() {
		System.out.println("Start init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy the process");
	}
}
