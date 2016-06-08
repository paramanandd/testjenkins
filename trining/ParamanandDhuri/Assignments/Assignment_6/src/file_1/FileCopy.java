package file_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileCopy {

	String name;
	int id;
	String order;
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	   
	public void accept() throws IOException       //Accepting Input From User 
	{
	System.out.println("Enter the name   ");	            
	name=br.readLine();
	System.out.println("Enter the id   ");	
    id=Integer.parseInt(br.readLine());
	System.out.println("Enter the order ");	
	order=br.readLine();
	}
	
	public void writeToFile() throws IOException                //Reading  From One File and Copying to Another File
	{
		
		File sourceFile=new File("file1.txt");
		File destFile=new File("file2.txt");
		FileWriter fw=new FileWriter(sourceFile);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(name);	                                        //Writing To File1
		bw.write(id);                                       
		bw.write(order);		
		System.out.println("Data Written");
		bw.flush();
		bw.close();
		
		
	   
	    InputStream input = null;
		OutputStream output = null;

	

			/* FileInputStream to read streams */
			input = new FileInputStream(sourceFile);                  

			/* FileOutputStream to write streams */
			output = new FileOutputStream(destFile);

			byte[] buf = new byte[1024];
			int bytesRead;

			while ((bytesRead = input.read(buf)) > 0) {                //Reading From File1   
				output.write(buf, 0, bytesRead);                       //Writing To File2 
	
			}
			
		System.out.println("Content is Written to File2 ");	
	   
	}
	
	public static void main(String[] args) throws IOException {
		
		FileCopy f=new FileCopy();
		f.accept();
		f.writeToFile();

	}

}
