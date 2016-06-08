package Print_3;


abstract class Shapes implements printable
{
   int side1 ,side2;
	public  abstract void calArea();
	
	
	public void print() 
	{
		System.out.println(" Shape class");	 
	}

}


class Rectangle extends Shapes{

	public Rectangle(int a,int b)
	{
		side1=a;
		side2=b;
	}
	@Override
	public void calArea() {
		int area=side1*side2;
		System.out.println("Area of rectangle is "+area);
		
	}
	
}


class Triangle extends Shapes{
	public Triangle(int a,int b)
	{
		side1=a;
		side2=b;
	}
	@Override
	public void calArea() {
		int area=(side1*side2)/2;
		System.out.println("Area of Triangle is "+area);
		
	}
	
}


class Circle extends Shapes{

	public Circle(int a)
	{
		side1=a;
		
	}
	@Override
	public void calArea() {
		double area=3.14*side1;
		System.out.println("Area of Circle is "+area);
		
	}
	
}