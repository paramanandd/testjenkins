
package com.test;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class firsttest {
	@Test
	public void main() throws InterruptedException, MalformedURLException{
		WebDriver driver = new HtmlUnitDriver(); 
		driver.get("http://www.google.com/");				

		 // Locate the searchbox using its name		
        WebElement element = driver.findElement(By.name("9"));	
        
       // Enter a search query		
       element.sendKeys("guru99");	
      
    	
       System.out.println("Page title is: " + driver.getTitle());		
       
       driver.quit();	
	}
}
