package com.Annotation.CoreQuestion5.model;

public class Student {
 private String studentName;
 private int studentId;
 private String branch;
 
 public Student() {
	}

	public Student(int i, String n, String jt) {
		this.studentId = i;
		this.studentName = n;
		this.branch = jt;
	}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
 
@Override
public String toString() {
	return studentId + "," + studentName + "," + branch;
}
}
