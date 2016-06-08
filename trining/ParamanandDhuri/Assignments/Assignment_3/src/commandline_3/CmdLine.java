package commandline_3;

public class CmdLine 
{
 public static void main(String[] args)
 {
	int i,j;
	int temp;
	int a[]=new int[20];                     //CREATING array of integer

		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.valueOf(args[i]);      //converting string to integer
		}
	
		for(i=0;i<args.length;i++)             //SORTING THE ELEMENTS IN ARRAY using Bubble sort
		 {
			 for(j=0;j<args.length-i-1;j++)
			 {
				 if(a[j]>a[j+1])
				 {
				 temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
				 }
			 }	
		 }
		
	System.out.println("Sorted array elements are:");
		for(i=0;i<args.length;i++)
		 {
			System.out.println(a[i]+"\t");        ////PRINTING SORTED ELEMENTS
		 }
	
 }
}