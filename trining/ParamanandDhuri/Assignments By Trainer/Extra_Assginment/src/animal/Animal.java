package animal;

public abstract class Animal 
{

	public void eat()
	{
		System.out.println("All Animal Eat For Survival");   //Concrete Method in abstract Class
	}
	
	public abstract void makeNoise();                        //Abstract Method

	
	
	public static void main(String[] args)                   //Main Method
	{		 
		Animal []a={new Cat(),new Dog()};                    //Creating Array Of Refrence  
		for (Animal animal : a) {
			animal.makeNoise();                              // Method Calling  (Polymorphism)
			animal.eat();
		}
	}
}


class Cat extends Animal
{

	@Override
	public void makeNoise()                                //Overriding Method
	{
		System.out.println("Meaaaaau Meeeaaaaauu");
		
	}


}


class Dog extends Animal
{

	@Override
	public void makeNoise() 
	{                                                      //Overriding Method   
		System.out.println("bhaaau bhaaau bhaau");
	}

}



