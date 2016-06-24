package com.assginment3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {
	


		@Test
		public void TestMethod() throws InterruptedException
		{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_state_switch4");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.cssSelector("html>body>button")).click();
		driver.switchTo().alert().sendKeys("Martini");
		driver.switchTo().alert().accept();
		Assert.assertEquals("Excellent choice. Martini is good for your soul.",driver.findElement(By.id("demo")).getText());
		
		driver.findElement(By.cssSelector("html>body>button")).click();
		driver.switchTo().alert().sendKeys("Cosmopolitan");
		driver.switchTo().alert().accept();
		
		Assert.assertEquals("Really? Are you sure the Cosmopolitan is your favorite?",driver.findElement(By.id("demo")).getText());
		
		
		driver.findElement(By.cssSelector("html>body>button")).click();
		driver.switchTo().alert().sendKeys("Milk");
		driver.switchTo().alert().accept();
		
		Assert.assertEquals("I have never heard of that one..",driver.findElement(By.id("demo")).getText());
		
		
		
		
		
		}
	}



