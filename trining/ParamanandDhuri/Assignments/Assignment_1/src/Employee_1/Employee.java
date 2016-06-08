package Employee_1;

public abstract class Employee 
{                                                                //Employee Class
	double salary;
	public Employee(double sal)
		{
			salary=sal;
		}
	public abstract void calSal();                           //calsal as abstract method
	 
	public static void main(String args[])
	 	{
			 Employee []e={new Manager(20000,1000),new SalesManager(23000,2300)};  //Array of employee
			 for (Employee employee : e)
			 {
			 employee.calSal();			                             //Showing Dynamic Polymorphism
			 }
	 	}
}


class Manager extends Employee
{                                                                     //Manager class extending Employee
		double allowance;	
		public Manager(double sal,double all)
		{
			super(sal);                                             //calling base class constructor
			allowance=all;
		}
	
		@Override
		public void calSal()
		{	                                                        //implementing calsal in manager class
			double Total=salary+allowance;	
			System.out.println("Total salary of Manager is"+Total);
		}
}


class SalesManager extends Employee                                //salesmanger class
{
		double Commission;
		public SalesManager(double sal,double comm)
		{
			super(sal);
			Commission=comm;
		}		
		
		@Override
		public void calSal()
		{	
			double Total=salary+Commission;	
			System.out.println("Total salary of SalesManager is"+Total);
		}
}



