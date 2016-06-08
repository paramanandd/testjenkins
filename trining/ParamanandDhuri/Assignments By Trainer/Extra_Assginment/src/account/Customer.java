package account;

import java.util.Scanner;
public class Customer
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("1.Fixed Deposite 2.Current Account");
		int choice=sc.nextInt();
		if(choice==1) {
		 Account acc=new FixedDepAccount();             //Calling Function Depending UPon Choice
		 acc.calInterest(10);
		 acc.toString();
		}
		else
		{
			Account acc=new CurrDepAccount();         
			acc.calInterest(10);
		}
		}
	 			
	}
 
abstract class Account                           //Abstract Class
{
String accountType;
int accountNo;                                  //States
double minBalance;                             
double CurrBalance;

public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public double getMinBalance() {
	return minBalance;
}
public void setMinBalance(double minBalance) {
	this.minBalance = minBalance;
}
public double getCurrBalance() {
	return CurrBalance;
}
public void setCurrBalance(double currBalance) {
	CurrBalance = currBalance;
}
                                           
public abstract void calInterest(double rate);                                //Abstract Method

static Scanner sc=new Scanner(System.in);
	

}


class FixedDepAccount extends Account
{	

public void calInterest(double rate) {
	{
		String acctype="Fixed Deposite";
		setAccountType(acctype);
		System.out.println("enter the account no");             //Calculating Interest For Fixed Deposit
		int acno=sc.nextInt();
		setAccountNo(acno);
		double minbal=500;
		setMinBalance(minbal);
		System.out.println("enter the current balance");
		double balance=sc.nextDouble();
		setCurrBalance(balance);
		double interest=(getCurrBalance()*1*rate);
		System.out.println("interest  amount is "+interest);
		
	}
}

 
}

class CurrDepAccount extends Account
{
	

	public void calInterest(double rate) {
		{
			String acctype="Fixed Deposite";
			setAccountType(acctype);
			System.out.println("enter the account no");
			int acno=sc.nextInt();                                     //Calculating Interest For Current Deposite
			setAccountNo(acno);
			double minbal=500;
			setMinBalance(minbal);
			System.out.println("enter the current balance");
			double balance=sc.nextDouble();
			setCurrBalance(balance);
			double interest=(getCurrBalance()*1*rate);
			System.out.println("interest  amount is "+interest);
			}
	}
	
}