package com.assignment2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {
	

		@Test
		public void TestMethod() throws InterruptedException
		{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm2");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.cssSelector("html>body>button")).click();
		driver.switchTo().alert().accept();
		Assert.assertEquals("You pressed OK!",driver.findElement(By.id("demo")).getText());
		driver.findElement(By.cssSelector("html>body>button")).click();
		driver.switchTo().alert().dismiss();;
		Assert.assertEquals("You pressed Cancel!",driver.findElement(By.id("demo")).getText());
		
		
		}

	}

