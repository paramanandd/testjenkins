package multithreading;

public class Run {

	public static void main(String[] args) throws InterruptedException
	{
		Account a=new Account(1234,5000);
		Customer c1=new Customer(1,a);				//PASSED SAME ACCOUNT OBJECT TO CREATE  JOINED ACCOUNT
		Customer c2=new Customer(2,a);
		
		Thread t1=new WithdrawalThread(c1,3000);
		Thread t2=new WithdrawalThread(c2,3000);
		System.out.println(a);
		t1.start();									//THREADS STARTED
		t2.start();
		t1.join();									
		t2.join();
		System.out.println(a);
		
	}

}
