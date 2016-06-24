package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyClass {
	 WebDriver driver ;
	@Test
	public void propertyRead() throws IOException
	{
       FileInputStream inputFile=new FileInputStream(new File("resource/data.properties"));
       Properties prop=new Properties();
       prop.load(inputFile);
       String brow=prop.getProperty("browser");
       if(brow.equals("firefox"))
      {
     
    	  driver=new FirefoxDriver();
      }
      if(brow.equals("chrome"))
      {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Java & Web Drivers\\Selenium-for-Training\\chromedriver.exe"); //Path of chrome executable.
  		 driver = new ChromeDriver();
  	
      }
       
       driver.manage().window().maximize();  
 
       driver.get(prop.getProperty("url"));  
       
       driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[1]/a")).click();
       
       Assert.assertEquals("Careers", driver.getTitle());
	}
	
}
