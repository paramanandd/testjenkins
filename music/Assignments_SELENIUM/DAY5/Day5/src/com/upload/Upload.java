package com.upload;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload {
	@Test
	public void uploadFile() throws InterruptedException, IOException
	{
		
		String []parma=new String[]{"C:\\Users\\trng7\\Documents\\upload.exe","File Upload","rohitjan.jpg"};
		Thread.sleep(2000);
		Runtime.getRuntime().exec(parma);
	    WebDriver driver=new FirefoxDriver();
		driver.get("http://cybintranet:8085/HomePage_Applications/Submit%20a%20photo.aspx");
		
       
	}
}
