package employeeSort;


import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;



public class Emp implements Comparable<Emp>
{                     
	int empID;
	private String eName;                                                      //States
	double eSalary;                                                


public Emp(int empID, String eName, double eSalary) 
{
	super();
	this.empID = empID;                                          //Parameterised Constructor
	this.seteName(eName);
	this.eSalary = eSalary;
}



public int getEmpID() 
{
	return empID;                                                 //Getter Setter
}

public void setEmpID(int empID) 
{
	this.empID = empID;
}



static Scanner sc=new Scanner(System.in);                          
static SortedSet<Emp> eSet=new TreeSet<Emp>();                   //Creating Collection

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
	Emp e=new Emp(id, name, slary);
	eSet.add(e);                                                //Adding Objects To Collection
	  
	  
}

 for (Emp e : eSet) 
	{
			System.out.println(" Employee ID :"+e.empID +"Employee Name :"+e.geteName());                    //Displaying Sorted Elements
			
	}
	 

}



@Override
public int compareTo(Emp o1) {                            //Implementing ComapareTo Method
	if(this.getEmpID() >o1.getEmpID())
	{
		return 1;
	}
	else if(this.getEmpID()<o1.getEmpID())
	{
		return -1;
	}
	else
	{
		return 0;
	}
}



public String geteName() {
	return eName;
}



public void seteName(String eName) {
	this.eName = eName;
}
		
}
 
