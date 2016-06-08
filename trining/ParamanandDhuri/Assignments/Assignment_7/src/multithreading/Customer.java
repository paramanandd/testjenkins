package multithreading;

public class Customer {
int custId;
Account acc;                                          //ASSOCIATION RELATION


public Customer(int custId, Account acc) {
	super();
	this.custId = custId;
	this.acc = acc;
}


public Account getAcc() {
	return acc;
}

}
