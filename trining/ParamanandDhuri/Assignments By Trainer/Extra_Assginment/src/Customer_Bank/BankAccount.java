package Customer_Bank;

import java.util.ArrayList;
import java.util.Scanner;


class Customer
{
String name;
String address;                                                    //States
int accno;
double balance;

public Customer(String name, String address, int accno, double balance) {
	super();
	this.name = name;
	this.address = address;
	this.accno = accno;                                            //Constructor
	this.balance = balance;
}



}

public class BankAccount {
	static Scanner sc=new Scanner(System.in);
	ArrayList<Customer> customerList=new ArrayList<Customer>();
	public void addCustomer()
	{
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter Address");                      //Adding Customer
		String adress=sc.next();
		
		System.out.println("Enter Acccountno");
		int accno=sc.nextInt();
		
		System.out.println("Enter Balance");
		double balance=sc.nextDouble();
		
		Customer c1=new Customer(name, adress, accno, balance);
		
		customerList.add(c1);
		System.out.println("customer Added");
	}
	public void displayCustomer()                                   //Displaying Info
	{
		for (Customer customer : customerList) {
			System.out.println("name"+customer.name+"Address"+customer.address+"Acc no"+customer.accno+"Balance"+customer.balance);
		}
		
	}
	
	public void deleteCustomer(String cust)
	{
		
	for (Customer customer : customerList) {
		if(customer.name.equals(cust))                              //Removing Customer 
		{
			customerList.remove(customer);
			System.out.println(customer.name+"Removed");
		}
	}
	
	}
	
	public void updateCustomer(String cust)
	{
		
		for (Customer customer : customerList) {
			if(customer.name.equals(cust))
			{
				System.out.println("enter new address");
				String add=sc.next();
				System.out.println("enter the balance");
				double bal=sc.nextDouble();
				customer.address=add;                              //Updating Customer
				customer.balance=bal;
				System.out.println("customer updated");
			}
			}
	}
	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		for(;;){
		System.out.println("Press 1 :Add Customer  2:Delete Customer  3:Update Customer  4:Display Info");
		
		
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			
			b1.addCustomer();
			break;
        case 2:
			System.out.println("enter the name of the customer to be deleted ");
			String dName=sc.next();
			b1.deleteCustomer(dName);
			break;                                                                 
        case 3:
        	System.out.println("enter the name of the customer to be updated ");
			String Name=sc.next();
			b1.updateCustomer(Name);
			break;
        case 4:
        	b1.displayCustomer();
        	break;

		default:
			break;
		}
		}
	}

}
