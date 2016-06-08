
package Print_3;
 abstract class Animal implements printable{
	public void respirate()
	{
		System.out.println(" respiration in own way");
	}
	public abstract void talk();
	
	
	public void print()
	{
		System.out.println(" Animal class");
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

