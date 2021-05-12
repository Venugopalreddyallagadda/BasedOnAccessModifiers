package com.ojas.mar9;

public class Student {
	public int studentId;
	public String studentName;
	private int marks;
	private char grade;

	
	public Student(int studentId, String studentName, int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		calculateGrade();
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String displayDetails() {

		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", grade="
				+ grade + "]";
	}

	private void calculateGrade() {

		if (marks > 90) {
			grade = 'A';
		} else if (marks > 80 && marks <= 90) {
			grade = 'B';
		} else if (marks > 70 && marks <= 80) {
			grade = 'C';
		} else if (marks > 60 && marks <= 70) {
			grade = 'D';
		} else if (marks < 60) {
			grade = 'E';

		}
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", grade="
				+ grade + "]";
	}

}

