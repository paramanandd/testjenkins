package updateSalaryProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class SalaryProcedure
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Mydatabase","root","root");
		
		
		System.out.println("enter the employee id to update the salary");					//input from user (id,hra)
		int id=sc.nextInt();
		System.out.println("enter the hra of the employee");
		int hra=sc.nextInt();
		
		CallableStatement cst=con.prepareCall("{call salaryProcedure(?,?,?)}");				//procedure called with three parameters 
		cst.registerOutParameter(3,java.sql.Types.DOUBLE);									//one OUT parameter for getting the updated salary
		cst.setInt(1, id);																	//two IN parameters for giving input of id and hra to perform operations
		cst.setInt(2, hra);
		cst.execute();
		System.out.println("updated salary is"+cst.getDouble(3));							//printing the updated salary
		
	}
	
}
