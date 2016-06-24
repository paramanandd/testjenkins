package com.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[2]")).click();
		driver.findElement(By.xpath(".//*[@id='archive-link']/a")).click();
		WebElement wElement=driver.findElement(By.xpath(".//*[@id='lang-chooser']"));
		Select se=new Select(wElement);
		se.selectByValue("hi");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='highlight']/ul/li[1]/div/div[1]/a/img")).click();
		
		
	}
	
}
