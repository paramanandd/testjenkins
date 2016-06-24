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
		driver.get("http://www.ehow.com");
		driver.manage().window().maximize();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 8000);");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".gtm_social.target.twitter.elegant-icons")).click();
		
		
		String Parent_Window = driver.getWindowHandle();    
	    // Switching from parent window to child window   
		for (String Child_Window : driver.getWindowHandles())  
		{  
			driver.switchTo().window(Child_Window);  
			// Performing actions on child window  
			System.out.println(driver.getTitle());  
		}  
		driver.switchTo().window(Parent_Window); 
		System.out.println(driver.getTitle()); 
	}
}
