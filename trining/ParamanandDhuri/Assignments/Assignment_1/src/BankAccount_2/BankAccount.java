package BankAccount_2;

public abstract class BankAccount
{
	double amount;
	double time;
		
	abstract void calculateAmount();                                //declaring abstract method
	public BankAccount(double amount, double time) 
		{	
			this.amount = amount;
			this.time = time;                                    //initialising variable in constructor
			
		}
	
	public static void main(String[] args)
	{
		BankAccount []b={new Saving(20000,2,7.5),new Current(20000,2,5.6) };
		for (BankAccount bankAccount : b) 
		{                                                       //runtime polymorphism
			bankAccount.calculateAmount();
		}
	}
}

class Saving extends BankAccount
{
		double RateOfInterest;                                           //saving class extending bankAccount
		public Saving(double amount, double time, double rateOfInterest)
		{
			super(amount, time);                                        //calling base class constructor using super
			RateOfInterest = rateOfInterest;
		}

		@Override
		void calculateAmount() 
		{                                                                //IMPLEMENTING ABSTRACT METHOD IN DERIVED CLASS
			double Total=amount*time*RateOfInterest;
			System.out.println("total amount in saving account   "+Total);
		}		
}
class Current extends BankAccount
{
		double RateOfInterest;                                          //CURRENT CLASS EXTENDING BANK CLASS

		public Current(double amount, double time, double rateOfInterest)
		{
			super(amount, time);
			RateOfInterest = rateOfInterest;
		}
		
		@Override
		void calculateAmount()
		{
			double Total=amount*time*RateOfInterest;
			System.out.println("total amount in Current account   "+Total);
		}
}