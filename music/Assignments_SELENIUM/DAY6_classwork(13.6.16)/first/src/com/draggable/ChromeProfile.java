package com.draggable;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeProfile {

	@Test
	public void chrmoeprofile()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\trng7\\Documents\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	}
	
}
