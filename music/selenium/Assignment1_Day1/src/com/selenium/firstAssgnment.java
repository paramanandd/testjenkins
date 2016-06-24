package com.selenium;

import java.net.MalformedURLException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class firstAssgnment {
	@Test
	public void standAloneWebDriverChrome() throws InterruptedException, MalformedURLException{
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer.exe"); //Path of chrome executable.
		WebDriver driver;
		driver = new InternetExplorerDriver();
		driver.get("http://www.ehow.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"eHow | How to - Discover the expert in you! | eHow" );
		driver.findElement(By.xpath(".//*[@id='Footer']/div[1]/div/div/div[2]/div/nav/ul/li[1]/ul/li[1]")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"About eHow | eHow" );
		
	}
}
