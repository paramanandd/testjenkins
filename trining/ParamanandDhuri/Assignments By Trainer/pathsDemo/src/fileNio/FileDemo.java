package fileNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {
	public static void main(String[] args) throws IOException
	{
		Path path=Paths.get("D:\\hell.txt");                      //Creating File At Particular Path
		Path path1=Paths.get("D:\\hell1.txt");                    //Creating Another File at That Location
		Files.copy(path, path1);                                  //Copying The content of File1 to File2
		System.out.println("file copied to "+path1.getFileName());       
		Files.deleteIfExists(path1);                              //Deleting new File
		System.out.println("file deleted "+path1.getFileName());
	}

}
