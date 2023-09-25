package com.autowiring;

// @Autowiring - ek obj k ander dusre obj ko inject karana ho automatically without using bean. [<bean id="" class="c"><property><ref bean="employee">/</property></bean>- ese mannualy krte hai].
public class Emp {

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
