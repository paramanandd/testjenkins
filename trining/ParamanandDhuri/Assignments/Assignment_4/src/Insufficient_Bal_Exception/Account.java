package Insufficient_Bal_Exception;

import java.util.Scanner;

class InsufficientBalanceException extends Exception                     //USERDEFINED EXCEPTION CLASS
{
	 public void exceptionMessage()
	 {
		 System.out.println("Insufficient Balance !!Exception Caught");  //USER FRIENDLY MESSAGE
	 }
}


 public class Account                                                    //MAIN CLASS
 {
	static double balance=25000;                                         //KEEPING BALANCE FIXED
	
	public static void main(String[] args) 
	{
	   try
	   {
			System.out.println("Enter The Widrawal Amount");              //ACCEPTING INPUT
			Scanner sc=new Scanner(System.in);
			double wAmount=sc.nextDouble();
				if(balance<wAmount)                                       //CHECKING BALANCE 
					throw new InsufficientBalanceException();             //THROWING EXCEPTION
				else
				{
					System.out.println("Money widrawn successfully and remaining balance is  "+(balance-wAmount));
	                 balance=balance-wAmount;
				}
	   }
	    
	   catch(InsufficientBalanceException ex)                             // HANDLING EXCEPTION
		{
			ex.exceptionMessage();
		}
	   
	   finally
	   {
		   System.out.println("Current Account Balance is"+balance);       //FINDING CURRENT BALANCE
	   }
	}
	
}
