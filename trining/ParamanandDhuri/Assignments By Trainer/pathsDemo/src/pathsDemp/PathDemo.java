package pathsDemp;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.nio.file.WatchService;
import java.nio.*;
import java.nio.file.*;
															

public class PathDemo {
public static void main(String[] args) throws IOException {

	Path path=Paths.get("D:\\hello.txt");
	
	System.out.println("Total Files" +path.getNameCount());          //Total Files
	System.out.println("Parent :" +path.getParent());                //Getting Parent of  File 
	System.out.println("File System :" +path.getFileSystem());       //FileSystem
	System.out.println("Root :" +path.getRoot());                    //Getting Root
	System.out.println("Absolute Path :" +path.isAbsolute());        //Is Path is Absolute/Relative 

	
	
	
	
	
}
}
