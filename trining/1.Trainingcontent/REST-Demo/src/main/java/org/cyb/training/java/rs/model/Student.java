package main.java.org.cyb.training.java.rs.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	String studentName;
	int studentId;
	String studentCourse;
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
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	
}
