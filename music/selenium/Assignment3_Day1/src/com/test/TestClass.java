package com.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.pagefactory.HomePage;
import com.pagefactory.WorldWidePage;

public class TestClass {

	WebDriver driver;
	long start;
	@Before
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","D:\\MySelenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		start = System.currentTimeMillis();
		driver.get("http://www.cybage.com");
	}
	
	
	
	@Test
	public void test() {
		HomePage homePageObj=new HomePage(driver);
		WorldWidePage gPageObj=new WorldWidePage(driver);
		homePageObj.clickW();
		long wtime=System.currentTimeMillis();
		gPageObj.clickG();
		long gtime = System.currentTimeMillis();

        long WTime = wtime - start; 
        long GTime = gtime - start; 
System.out.println("Total Time for worldwide load  in milliseconds- "+WTime);
System.out.println("Total Time for germany load in milliseconds - "+GTime);

	}

}
