package com.autowiringusingannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired // we can use this anno in ways property,setter method,constructor, en tino k upr ese lga skte hai bS anno ki jgh hi change krni h.
	//Autowired ko use krne k liye hme xml file m batana padega.
	//@Qualifier("temp2"); //jab same class k bean ho different name k to eska use ye batane k liye krte hai ki kon sa bean hme use krna hai. 
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	

}
