package chatApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{

	public static void main(String[] args) throws IOException 
	{
		ServerSocket ss=new ServerSocket(2000);               //Creating serverSocket object
		Socket sk=ss.accept();                                //Accepting input From Client 
		BufferedReader cin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
		PrintStream cout=new PrintStream(sk.getOutputStream());
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (true)
		{
			s=cin.readLine();
  			if (s.equalsIgnoreCase("END"))
  			{
				cout.println("BYE");
    				break;
  			  }
			System. out.print("Client : "+s+"\n");
			System.out.print("Server : ");
			s=stdin.readLine();
			cout.println(s);
		}
		ss.close();
 		sk.close();
 		cin.close();
		cout.close();
 		stdin.close();
	}
	

}
