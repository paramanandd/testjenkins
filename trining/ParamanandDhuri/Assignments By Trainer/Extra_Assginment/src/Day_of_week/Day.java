package Day_of_week;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		System.out.println("Enter the day in Number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		switch(number)
		{
		case 1: System.out.println("Day is Monday");
		         break;
		case 2: System.out.println("Day is Tuesday");
        break;
		case 3: System.out.println("Day is Wednesday");
        break;
		case 4: System.out.println("Day is Thursday");
        break;
		case 5: System.out.println("Day is Friday");
        break;
		case 6: System.out.println("Day is Saturday");
        break;
		case 7: System.out.println("Day is Sunday");
        break;
        default: System.out.println("Invalid Number");
        break;
        
		}
	}

}
