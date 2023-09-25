package com.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//Stereotype Annotations -> means no need to create bean for make the class object if U use @Component Annotation
//@Component
@Component("ob") //yha bean ka bhi name forcefully change ho skta hai 
@Scope("prototype")
public class Student {	
	@Value("Himanshu Sharma")
	private String name;
	@Value("Delhi")
	private String city;
	
	@Value("#{temps}") // {temps} ->it is expression language esme hmne xml file m values dali hai jo id k through access ho rahi hai.
	private List<String> addresses;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
