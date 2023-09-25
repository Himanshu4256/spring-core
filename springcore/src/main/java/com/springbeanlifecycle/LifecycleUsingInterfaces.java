package com.springbeanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifecycleUsingInterfaces implements InitializingBean, DisposableBean {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LifecycleUsingInterfaces [price=" + price + "]";
	}

	
	public void afterPropertiesSet() throws Exception {
		// ye InitializingBean ka method hai jo init() method ka work krta hai.
		System.out.println("Taking Drink (init)");
		
	}

	public void destroy() throws Exception {
		// work for destroy
		System.out.println("Put glass back on Table after drinking (Destroy)");
	}

}
