package com.ref_injection;

public class First {
	private int x;
	private Second obj;
	
	
	@Override
	public String toString() {
		return "First [x=" + x + ", obj=" + obj + "]";
	}
	
	
	public First() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Second getObj() {
		return obj;
	}
	public void setObj(Second obj) {
		this.obj = obj;
	}
	public First(int x, Second obj) {
		super();
		this.x = x;
		this.obj = obj;
	}
}
