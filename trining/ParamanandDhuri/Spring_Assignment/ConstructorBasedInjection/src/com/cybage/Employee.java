package com.cybage;

public class Employee {					//simple pojo class with constructor
int empid;
String name;

public Employee() {
	super();
}

public Employee(int empid, String name) {
	super();
	this.empid = empid;
	this.name = name;
}
public void display()					//display method to display the contents of the employee object
{
	System.out.println("Employee id: "+empid+"name : "+name);
}
}
