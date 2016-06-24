package com.test;

import java.net.MalformedURLException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class firstAssgnment {
	@Test
	public void standAloneWebDriverChrome() throws InterruptedException, MalformedURLException{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe"); //Path of chrome executable.
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.ehow.com");
		Assert.assertEquals(driver.getTitle(),"eHow | How to - Discover the expert in you! | eHow" );
		driver.findElement(By.className("title")).click();
		Assert.assertEquals(driver.getTitle(),"About eHow | eHow" );
		
	}
}
