package com.assignment3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {
	
	@org.junit.Test
	public void Test() throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath(".//*[@data-code='H']")).click();
		driver.findElement(By.xpath(".//*[@id='from_city_data_box']")).sendKeys("pune");
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath(".//*[@id='widget_row']/div[1]/div[1]/div[3]/div/div[4]/div/div/div/span/span"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			if(webElement.getText().contains("Pune, India"))
			{
				System.out.println("hello");
				webElement.click();
			}
		}
		
	}

}
