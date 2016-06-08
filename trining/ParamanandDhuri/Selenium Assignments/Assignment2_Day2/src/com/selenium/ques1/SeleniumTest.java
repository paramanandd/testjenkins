package com.selenium.ques1;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTest {

	@SuppressWarnings("deprecation")
	@Test
	public void TripTest() throws InterruptedException
	{
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://makemytrip.com");
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
	  driver.findElement(By.cssSelector("#from_city_data_box")).sendKeys("pune");
	 Thread.sleep(4000);
	  driver.findElement(By.className("night_number")).click();
	  driver.findElement(By.xpath(".//*[@id='nightAnchor']/div/div/ul/li[2]/a")).click();
	  
	 driver.findElement(By.xpath(".//*[@id='roomDiv_1']/div/div/div[2]/div/div/a[2]")).click();
	  
	  driver.findElement(By.id("hotels_submit")).click();
	 
	List<WebElement> li=driver.findElements(By.cssSelector(".pull-left.hotel_name.ng-binding"));
	
	//	System.out.println(li.get(0).getText());
	String hotelName=li.get(0).getText();
	  Assert.assertEquals("St Laurn Business Hotel", hotelName);
	//.pull-left.hotel_name.ng-binding
	}
}
