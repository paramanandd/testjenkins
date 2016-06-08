package Print_3;

interface printable
 {
 void print();	
 }

 public  class Utility 
   {  
	
	 void printAll(printable []pr)
      {
	     for (printable printable : pr)
	     {
		  printable.print();
	     }
	  }
 
	
	public static void main(String[] args)
	{
	  Utility u=new  Utility();
	  Shapes []p={new Circle(2),new Rectangle(3,4)};
	  Animal []q={new Cat(),new Dog(),new Lion()};
	  u.printAll(p);
	  u.printAll(q);
     }

  }
