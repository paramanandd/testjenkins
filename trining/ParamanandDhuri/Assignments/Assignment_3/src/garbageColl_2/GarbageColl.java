package garbageColl_2;

public class GarbageColl {

	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize is Called");    //Overriding the Finalize Method
		                                             //Garbage Collector Call Finalize method implicitly just before the
		                                               //destruction of object
	}

	public static void main(String[] args) {
 
		GarbageColl g1=new GarbageColl();
		System.out.println("Before Garbge Collection");
		g1=null;                                       //Nullfying Object
		System.gc();                                    //Expicitly Calling  Garbage Collector
		System.out.println("After Garbge Collection");
		 
		
	}

}
