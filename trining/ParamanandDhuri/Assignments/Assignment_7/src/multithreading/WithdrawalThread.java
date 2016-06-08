package multithreading;

public class WithdrawalThread extends Thread
{
Customer cust;  									//CUSTOMER REFERENCE (ASSOCIATION)
double amount;


public WithdrawalThread(Customer cust, double amount) {
	super();
	this.cust = cust;
	this.amount = amount;
}


@Override
public void run() {									

	cust.getAcc().withdraw(amount);						//CALLING WITHDRAW METHOD OF ACCOUNT CLASS USING CUSTOMER REFERENCE 
}




}
