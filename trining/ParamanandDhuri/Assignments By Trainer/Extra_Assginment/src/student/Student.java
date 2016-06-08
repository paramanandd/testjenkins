package student;

public class Student 
{
String name;
int id;
int age;

	public void setdata(String name,int id)       			//setdata method with two parameters 
	{
		this.name=name;
		this.id=id;	
		System.out.println(" details :"+name+ id);
	}
	
	public void setdata(String name,int id,int age)			//setdata method with three parameters 
	{
		this.name=name;
		this.id=id;
		this.age=age;
		System.out.println(" details :"+name+ id+ age);
	}
	
	
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.setdata("rohit",2);								
		s1.setdata("parma", 1, 23);							//method overloading for two and three parameters 
	}
}