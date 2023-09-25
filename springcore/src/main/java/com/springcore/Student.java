package com.springcore;


// these type of classes are called beans.
public class Student {

	private int studentId;
	private String studentName;
	private String studentAddress;
	
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	public int getStudentId() {
		
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setting working on Id");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting working on Name");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting working on Address");
		this.studentAddress = studentAddress;
	}
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
