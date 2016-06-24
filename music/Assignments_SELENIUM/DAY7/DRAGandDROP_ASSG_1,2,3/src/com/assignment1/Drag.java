package com.assignment1;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	@Test
	public void dragtest() throws InterruptedException
	{
	WebDriver driver= new FirefoxDriver();
	driver.get("http://marcojakob.github.io/dart-dnd/nested-elements/web/");
	WebElement dragelement=driver.findElement(By.xpath("html/body/div[1]/div[1]"));
	WebElement dropelement1=driver.findElement(By.xpath("html/body/div[1]/div[2]/div"));
	WebElement dropelement2=driver.findElement(By.xpath("html/body/div[1]/div[2]/textarea"));
	WebElement dropelement3=driver.findElement(By.xpath("html/body/div[1]/div[2]/button"));
	
	Actions builder=new Actions(driver);
	Action dragdrop= builder.dragAndDrop(dragelement, dropelement1).build();
	Action dragdrop2= builder.dragAndDrop(dragelement, dropelement2).build();
	Action dragdrop3= builder.dragAndDrop(dragelement, dropelement3).build();
	
	dragdrop.perform();
	Thread.sleep(2000);
	dragdrop2.perform();
	Thread.sleep(2000);
	dragdrop3.perform();
	
	Thread.sleep(3000);
	
	driver.navigate().to("http://executeautomation.com/demosite/Dragging.html");
	WebElement drag=driver.findElement(By.id("item1"));
	WebElement droppable=driver.findElement(By.id("item4"));
	
	Actions builder1=new Actions(driver);
	Action drop= builder1.dragAndDrop(drag, droppable).build();
	
	drop.perform();
	Thread.sleep(2000);
	List<WebElement> listWeb=driver.findElements(By.xpath(".//*[@id='sortable']/li"));
	for (WebElement webElement : listWeb) 
	{
		
		System.out.println(webElement.getText());
		
	}
	
	}
}
