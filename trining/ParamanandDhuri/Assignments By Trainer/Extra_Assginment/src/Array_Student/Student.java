package Array_Student;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) 
	{
		int i;
		String[] n=new String[20];                    //Creating Array of String(Static Memory Allocation)
		System.out.println("Enter the Number of Students");     
		Scanner sc=new Scanner(System.in);                   
		int no=sc.nextInt();                          //Accepting Input From User  
		System.out.println("Enter " +no+ "names");
		
		for(i=0;i<no;i++)
		{
	    n[i]=sc.next();                               //Storing User Input In Array
		}
	System.out.println("Enter the number to Access");
	int j=sc.nextInt();                              //Accessing The Random Array
	System.out.println(n[j-1]);

	}}
