package com.draggable;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ehow {
	@Test
	public void test()
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.ehow.com");
		WebElement w1=driver.findElement(By.xpath(".//*[@id='Header']/section/div/div[1]/span/label"));
		WebElement w2=driver.findElement(By.xpath(".//*[@id='Header']/section/div/div[1]/span/div/div[1]/ul[1]/li[2]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(w1);
		action.click(w2).build().perform();
		
	}
}
