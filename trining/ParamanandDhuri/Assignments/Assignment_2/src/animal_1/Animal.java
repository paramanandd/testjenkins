
package animal_1;

public abstract class Animal {
	public void respirate()
	{
		System.out.println(" respiration");
	}
	public abstract void talk();
	
	
	public static void main(String a[])
	{
			Animal []a1={new Cat(),new Dog(),new Lion()};
			for (Animal animal : a1)
			{
				animal.talk();
			}	
	}
}

class Dog extends Animal
{
	public void talk()
	{
		System.out.println("bho bho");
	}

}

class Cat extends Animal
{
	public void talk()
	{
		System.out.println("meeaaauuu meeeaaauuu");
	}

}

class Lion extends Animal
{
	public void talk()
	{
		System.out.println("ghruuuu");
	}

}

