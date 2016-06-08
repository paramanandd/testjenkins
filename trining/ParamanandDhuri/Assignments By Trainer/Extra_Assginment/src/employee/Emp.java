package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Emp {
int eId;
String name;                                                      //Employee Class State
double salary;
int age;

	public Emp()
	{                                                             //Default Constructor 
		super();
	}
	public Emp(int eId, String name, double salary, int age)      //Parameterised Constructor
	{
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	static Scanner sc=new Scanner(System.in);
	ArrayList<Emp> EmpList=new ArrayList<Emp>();                  //Creating Collection 
	
	public void addEmp()
	{
		System.out.println("Enter name");
		String name=sc.next();                                   //Recieving Input from user 
		
		System.out.println("Enter id");
		int Id=sc.nextInt();
		
		System.out.println("Enter salary");
		double salary=sc.nextDouble();
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		Emp c1=new Emp(Id,name, salary, age);                   //Creating Employee object
		          
		EmpList.add(c1);                                        //Adding Object to Collection
		System.out.println("Employee Added");
	}
	
	public void highestSal()
   {
		double maxsal=0;
		for (Emp emp : EmpList)                                 //finding Highest Salary    
		{
			if(emp.salary>maxsal)
			{
				maxsal=emp.salary;	
			}
		}
		for (Emp emp : EmpList)
		{
			if(maxsal==emp.salary)                           //Finding Employee name with Highest Salary
			{
				System.out.println("employee with the maximum salary is"+emp.name);
			}
		}
   }

	public void seniorEmp()
	{
		double maxAge=0;
		for (Emp emp : EmpList) 
		{
			if(emp.age>maxAge)
			{
				maxAge=emp.age;                            //Finding Senior Employee By Comparing With Age 
			}
		}
		
		for (Emp emp : EmpList)
		{
			if(maxAge==emp.age)
			{
				System.out.println("Senior Employee Having Highest Salary"+emp.name+" "+emp.salary);
			}
		}
	}
	
	
	
	
	public static void main(String[] args)                            //Main method
	{
		Emp b1=new Emp();
		for(;;)
		{
			System.out.println("Press 1 :Add Employee  2:Highest salary employee  3:senior employee Having Highest Salary");
			int choice=sc.nextInt();
			switch (choice)
			{
			case 1:
				b1.addEmp();
				break;
	        case 2:
	        	b1.highestSal();
	        	break;
	        case 3:	
	        	b1.seniorEmp();

			}
		}
	}
}
