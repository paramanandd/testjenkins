package Negative_no_Exception;

import java.util.Scanner;

 class NegativeNoException extends Exception
{                                                          //USERDEFINED EXCEPTION CLASS
	public void exceptionMessage()
	{
		System.out.println("Please enter the positive numbers only");
	}
}

 
 public class NegativeException                           //MAIN CLASS
{
	public void findSquareRoot(double number)             //FINDING SQUAREROOT OF NUMBER                
	{
				double squareRoot=Math.sqrt(number);                  
				System.out.println("Square root is  "+squareRoot);
	}
	
	
	
	public static void main(String[] args)                //MAIN METHOD
	{
		
		try                                             
		{
			System.out.println("Enter The Number To Find The Squareroot "); //ACCEPTING INPUT
			Scanner sc=new Scanner(System.in);
			double number=sc.nextDouble();
			
			if(number<=0)                                //CHECKING AND THROWING EXCEPTION IF OCCURS
			{
				throw new NegativeNoException();
			}
		
			NegativeException no1=new NegativeException();	//CREATING MAIN CLASS OBJECT		 
			no1.findSquareRoot(number);		 				//CALLING FUNCTION
		}
		
		catch(NegativeNoException ex)		
		{
			ex.exceptionMessage();                           //CATCHING EXCEPTION 
		}
	
	}

	
}
