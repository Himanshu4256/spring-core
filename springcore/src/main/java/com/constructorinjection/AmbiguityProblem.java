package com.constructorinjection;


// it only means agr jo constuctor aapne call kiya hai wo class mai hai to wahi call hoga otherwise top-to-bottom challega.
public class AmbiguityProblem {
	private int a;
	private int b;
	
	public AmbiguityProblem(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor : int , int");
	}
	
	public AmbiguityProblem(double a,double b) {
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("Constructor : double , double");
	}
	
	public void doSum() {
		System.out.println("Sum is= " + (this.a + this.b));
	}

}
