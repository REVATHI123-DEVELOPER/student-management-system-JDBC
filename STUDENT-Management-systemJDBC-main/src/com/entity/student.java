package com.entity;

public class student {
	private int studentId;
	private String studentName;
	private String StudentPhone;
	private String StudentCity;
	
//	generate constructor using fields..
	public student(int studentId, String studentName, String studentPhone, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		StudentPhone = studentPhone;
		StudentCity = studentCity;
	}
	
// generate constructor without using id field 

public student(String studentName, String studentPhone, String studentCity) {
	super();
	this.studentName = studentName;
	StudentPhone = studentPhone;
	StudentCity = studentCity;
}

//create an generate constructors from super class

public student() {
	super();
	// TODO Auto-generated constructor stub
}

//from this step generate getters and setters..

@Override
public String toString() {
	return "student [studentId=" + studentId + ", studentName=" + studentName + ", StudentPhone=" + StudentPhone
			+ ", StudentCity=" + StudentCity + "]";
}

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getStudentPhone() {
	return StudentPhone;
}

public void setStudentPhone(String studentPhone) {
	StudentPhone = studentPhone;
}

public String getStudentCity() {
	return StudentCity;
}

public void setStudentCity(String studentCity) {
	StudentCity = studentCity;
}
	
//	at the same way generate the to_string methods also..
	
	



}
