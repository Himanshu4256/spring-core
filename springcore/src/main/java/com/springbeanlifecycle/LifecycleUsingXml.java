package com.springbeanlifecycle;

public class LifecycleUsingXml {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "LifecycleUsingXml [price=" + price + "]";
	}

	public LifecycleUsingXml() {
		super();
	}
		
	
	// yha object operation hone se pehle inti call hoga & after operation destroy call hoga. 
	public void init()  // u can change the mtd name
	{
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
