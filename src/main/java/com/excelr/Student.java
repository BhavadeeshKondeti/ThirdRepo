package com.excelr;

public class Student {

	int a=12;
	
	private int studentId=123;
	private String studentName="veda";
	private int studentMarks=567;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
