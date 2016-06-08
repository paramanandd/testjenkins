package getterDemo;

public class Employee {			//simple pojo class with getter and setter

	int id;
	String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void Display()				//display method to display the contents of the employee object
	{
		System.out.println(" id :" +id+" Name "+name);
	}
	
}
