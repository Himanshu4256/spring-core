package com.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
//@ComponentScan
@Component // esse bean nahi banana padega obj k liye bs component ko Active krna hoga XML file m phir obj auto banega.
public class Demo {
	@Value("#{ 30+30 }") // it is SPEL
	private int x;
	
	@Value("#{5+55+555}") // Here we can use var,method & method calling also
	private int y;
	
	//yha hame "static" method use krna hai Math class "Squart" ka.
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double z;
	
	//yha hme "static" variable ka use krenge
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;
	
	
	//yha kisi bhi cls ka obj bhi create kr skte hai
	@Value("#{ new java.lang.String('Himanshu Sharma') }")
	private String name;
	
	//boolean type
	@Value("#{ 8>3 }")
	private boolean isActive;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
 	
}
