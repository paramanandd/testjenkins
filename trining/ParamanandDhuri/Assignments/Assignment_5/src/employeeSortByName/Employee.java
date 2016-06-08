package employeeSortByName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Employee 
{
	int empID;
	String eName;                                                      //States
	double eSalary;                                                


public Employee(int empID, String eName, double eSalary) 
{
	super();
	this.empID = empID;                                          //Parameterised Constructor
	this.seteName(eName);
	this.eSalary = eSalary;
}


public String geteName() 
{
	return eName;
}

public void seteName(String eName) 
{
	this.eName = eName;
}

public int getEmpID() 
{
	return empID;
}

public void setEmpID(int empID)
{
	this.empID = empID;
}


static Scanner sc=new Scanner(System.in);                          
static List<Employee> eList=new ArrayList<Employee>();                   //Creating Collection

public static void main(String[] args)
{
	System.out.println("ADD NUMBER OF USER");                   
	int noOfEmp=sc.nextInt();
	System.out.println("Enter The ID NAME AND SALARY");
	for(int i=0;i<noOfEmp;i++)
	{                                                               //Accepting Input From User
		int id=sc.nextInt();
		String name=sc.next();
		double slary=sc.nextDouble();
		Employee e=new Employee(id, name, slary);
		eList.add(e);                                               //Adding Objects To Collection
		  
		  
	}
	
	
	Collections.sort(eList, new Comparator<Employee>()
			{
		    public int compare(Employee one,Employee two) 
		    {
		    	return one.geteName().compareTo(two.geteName());
		    }
	        });
	
	
	
	
	 for (Employee e : eList) 
		{
				System.out.println(" Employee ID :"+e.getEmpID() +"Employee Name :"+e.geteName());      //Displaying                  //Displaying Sorted Elements
				
		}
		 
	
	}
	
	

}
