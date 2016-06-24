package com.assignment2;

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
		WebElement w1=driver.findElement(By.xpath(".//*[@data-code='H']"));
		
		Actions builder=new Actions(driver);
	    Action event1=builder.click(w1).build();
	        event1.perform(); 	
	    WebElement w2=driver.findElement(By.xpath(".//*[@id='from_city_data_box']"));
		Action event2=builder.sendKeys(w2, "pune").build();
			event2.perform();
			Thread.sleep(2000);
		WebElement w3=driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div[1]/div[3]/div/div[4]/div/div/div/span/span/div/span/div[1]/p"));
		Action event3=builder.click(w3).build();
			event3.perform();
	}

}
