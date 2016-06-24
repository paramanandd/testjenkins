package com.first;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hello {

	@Test
	public void test()
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.cybage.com");
		WebElement w1=driver.findElement(By.xpath(".//*[@id='WebPartWPQ2']/div[1]/ul/li[2]/a/span[1]"));
		WebElement w2=driver.findElement(By.xpath(".//*[@id='78']/li[6]/a"));
		
		Actions action=new Actions(driver);
		action.moveToElement(w1);
		action.click(w2).build().perform();
		
	}
}
