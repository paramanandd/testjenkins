package com.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test4 {

	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cybage.com"); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[4]/a")).click();
		Thread.sleep(2200);
		driver.findElement(By.cssSelector(".global-search-link")).click();
		driver.findElement(By.xpath(".//*[@id='txtSearch']")).sendKeys("Automation");
		driver.findElement(By.cssSelector(".global-search-button")).click();
	    java.util.List<WebElement> listofweb=driver.findElements(By.cssSelector(".search-results-panel"));
	 	System.out.println(listofweb.size());
		driver.findElement(By.xpath(".//*[@id='searchResultsOuterDiv']/div[1]/a/span")).click();
		
		
	}
}
