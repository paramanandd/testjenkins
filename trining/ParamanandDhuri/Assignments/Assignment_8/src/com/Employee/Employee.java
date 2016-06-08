package com.Employee;

public class Employee 
{
int empID;
String eName;
float slary;

public Employee(int empID, String eName, float slary) {
	super();
	this.empID = empID;
	this.eName = eName;
	this.slary = slary;
}

public int getEmpID() {
	return empID;
}

public void setEmpID(int empID) {
	this.empID = empID;
}

public String geteName() {
	return eName;
}

public void seteName(String eName) {
	this.eName = eName;
}

public float getSlary() {
	return slary;
}

public void setSlary(float slary) {
	this.slary = slary;
}


	
}
