package com.test;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5 {

	@Test
	public void test() throws InterruptedException
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cybage.com");
		 Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath(".//*[@id='dvFooter']/div[2]/ul"));
	    for (WebElement webElement : list) {
			
	    	System.out.println(webElement.getText());
		}
	
	   /* Thread.sleep(2000);
	    driver.findElement(By.xpath(".//*[@id='dvFooter']/div[2]/ul/li[3]/a/span")).click();
	    Thread.sleep(2000);
	    driver.navigate().to("http://www.cybage.com");
	    driver.findElement(By.xpath(" .//*[@id='WebPartWPQ1']/div[1]/ul/li[5]/a")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(".//*[@id='txtSearch']")).sendKeys("Supply Chain Management");*/
	    
	    
	}
	
}
