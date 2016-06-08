package multithreading;

public class Account 
{
int accountNo;
double bal;


public Account(int accountNo, double bal) {
	super();
	this.accountNo = accountNo;
	this.bal = bal;
}


@Override
public String toString() {
	return "Account [accountNo=" + accountNo + ", bal=" + bal + "]";
}

public synchronized void withdraw(double amount)				//WITHDRAW METHOD 
{
	if(bal>amount)
	{
		System.out.println("Amount Withdrawal"+amount);
	    bal=bal-amount;
	}
	else
	{
		System.out.println("Insufficient Balance");
	}
	
}




} 

