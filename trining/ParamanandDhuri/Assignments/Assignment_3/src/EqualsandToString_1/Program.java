package EqualsandToString_1;

 class Employee {

	String eName;
	int eId;
	double eSalary;
	int eAge;

	public Employee(String eName, int eId, double eSalary, int eAge) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eSalary = eSalary;
		this.eAge = eAge;
	}

	@Override
	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}

	@Override
	public String toString() {
		return "Emp [eName=" + eName + ", eId=" + eId + ", eSalary=" + eSalary
				+ ", eAge=" + eAge + "]";
	}
	
}

public class Program
{
	public static void main(String[] args) {
		Employee e1=new Employee("Rohit", 1, 200, 23);
		Employee e2=new Employee("Rohit", 1, 200, 23);
		System.out.println(e1.equals(e2));
		System.out.println(e1.toString());
	}
}
