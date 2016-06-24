package com.cybage.assignment1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
	
	@Test
	public void Assgn1() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		((JavascriptExecutor)driver).executeScript("alert('hello world');");
		driver.switchTo().alert().accept();
		
		
	}
}
