package com.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class SaveEmployee 

{
	static Scanner sc=new Scanner(System.in);
	
   
	public Employee insertEmp()
	   {                                                             //Accepting Details from emp
		    System.out.println("Enter ID");                                   
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter Salary");
			float sal=sc.nextFloat();
			Employee emp=new Employee(id, name,sal);
			return emp;	   
	   }
   
	public Student insertStudent()                                  //Accepting Details from Student
	   {
		    System.out.println("Enter rollno");
			int roll=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter Address");
			String Address=sc.next();
			Student stud=new Student(roll, name,Address);
			return stud;	   
	   }
	

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");                                      
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Mydatabase","root","root");	  //Establishing Connection	
	    SaveEmployee e=new SaveEmployee();			
	    
			
		for(;;)
	    {	
		System.out.println("1. Insert employee   2.Update Employee 3.Display Employee 4. Insert Student 5. Display Student   6.Display MetaData");		
		int choice=sc.nextInt();				
		
			switch(choice)
			{
			case 1:
				Employee emp=e.insertEmp();
				PreparedStatement ps=con.prepareStatement("insert into emp(empid, ename, sal) values(?,?,?)"); //Inserting Employee To database 
				ps.setInt(1, 1);
				ps.setString(2,emp.geteName() );
				ps.setFloat(3, emp.getSlary());
				ps.executeUpdate();
				System.out.println("Inserted successfully");
				break;
			
			case 2:
				System.out.println("Enter the Employee Name you want to Update");                               //Updating Employee Details 
				String name =sc.next();
				System.out.println("Enter the new salary");
				float sal=sc.nextFloat();
				PreparedStatement pt=con.prepareStatement("update emp set sal=? where ename=?");
				pt.setFloat(1, sal);
				pt.setString(2, name);
				pt.executeUpdate();
				break;
			
			case 3:
				PreparedStatement pstmt=con.prepareStatement("select * from emp");                       //Displaying Employee
				ResultSet rs1=pstmt.executeQuery();
					while (rs1.next())
					{
						System.out.print("EmpId " + rs1.getInt(1));
						System.out.print("EmpName " + rs1.getString(2));
						System.out.println("EmpSalary " + rs1.getFloat(3));
					}
				break;
			
			case 4:                                                                                  //Inserting Student
				Student s1=e.insertStudent();
				PreparedStatement p1=con.prepareStatement("insert into student(rollno, name, address) values(?,?,?)");
				p1.setInt(1, s1.getRollNo());
				p1.setString(2,s1.getName() );
				p1.setString(3, s1.getAddress());
				p1.executeUpdate();
				System.out.println("Student Inserted successfully");
				break;
			
			case 5:
				PreparedStatement p=con.prepareStatement("select * from student");                 //Displaying Student
				ResultSet rs=p.executeQuery();
					while (rs.next())
					{
						System.out.print("roll no " + rs.getInt(1));
						System.out.print("Name " + rs.getString(2));
						System.out.println("Address " + rs.getString(3));
					}
				break;
				
			case 6:
				PreparedStatement p2=con.prepareStatement("select * from emp");                 //Displaying MetaData
				ResultSet rs2=p2.executeQuery();
				ResultSetMetaData rsmd=rs2.getMetaData();
				System.out.println(rsmd.getColumnLabel(1)+" "+rsmd.getColumnLabel(2)+ " "+rsmd.getColumnLabel(3));
				while(rs2.next())
				{
					System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getFloat(3));
				}
				break;
			}
	}

   }

}