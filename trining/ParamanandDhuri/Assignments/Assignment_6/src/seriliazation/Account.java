package seriliazation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;



public class Account implements Serializable
{
int accountNo;                                           //States
String name;
Date doc;


public Account()                                         //Default Constructor 
{
	    super();
}


public Account(int accountNo, String name, Date doc) {   //Parameterised Constructor        
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.doc = doc;
}


public void serializationMethod() throws IOException     //Serializing Object   
{
		 Account a=new Account(1234,"Rohit",new Date());
		 FileOutputStream fileOut=new FileOutputStream("object.txt");
		 ObjectOutputStream out=new ObjectOutputStream(fileOut);
		 out.writeObject(a);
		 out.close();
	     fileOut.close();
	     System.out.println("Object Serialised");
}


public void deserializationMethod() throws IOException, ClassNotFoundException //DesSerializing Object
{
		 FileInputStream fileInput=new FileInputStream("object.txt");
	     ObjectInputStream in=new ObjectInputStream(fileInput);
	     Account aa=(Account)in.readObject();	     
	     System.out.println("Deserialised Object");
	     System.out.println("Account no "+aa.accountNo);
	     System.out.println("Name  "+aa.name);
	     System.out.println("Date Of Creation " +aa.doc);
}



public static void main(String[] args) throws IOException, ClassNotFoundException  
	{
			      Account a=new Account();
			      a.serializationMethod();
			      a.deserializationMethod();

	}

}
