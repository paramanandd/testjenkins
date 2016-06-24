package com.lastDay;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
import com.google.common.base.Function;

public class Assignment2 {
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		/*FluentWait<WebDriver> waitf=new FluentWait<WebDriver>(driver)
					.withTimeout(15, TimeUnit.SECONDS)
					.pollingEvery(100, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class);
		
		WebElement search=waitf.until(new Function<WebDriver,WebElement>() {
			public WebElement apply(WebDriver driver){
				WebElement modify=driver.findElement(By.xpath(".//*[@id='ecwid-search']/div/input"));
				return modify;
			}
		});*/
		WebElement elememtElectronics=driver.findElement(By.xpath("html/body/div[5]/div[2]/ul[1]/li[2]/a"));
		WebElement cellphone=driver.findElement(By.xpath("html/body/div[5]/div[2]/ul[1]/li[2]/ul/li[2]/a"));
		
		Actions event=new Actions(driver);
		event.moveToElement(elememtElectronics).build().perform();
		Actions event2=new Actions(driver);
		event2.moveToElement(cellphone).click().build().perform();
		driver.findElement(By.xpath("html/body/div[5]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[1]/a[1]")).click();
		for(int i=1;i<4;i++)
		{
		String s1=driver.findElement(By.xpath("html/body/div[5]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div["+i+"]/div/div[2]/div[3]/div[1]")).getText();
		Map<Integer,String> map=new HashMap();
		//java.lang.StringBuilder.deleteCharAt(s1,0);
		map.put(i,s1);
		System.out.println(s1);
		}
		
		
	}
}
