package com.draggable;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	@Test
	public void drag()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.jqueryui.com/droppable");
		driver.switchTo().frame(0);
		WebElement w1=driver.findElement(By.id("draggable"));
		WebElement w2=driver.findElement(By.id("droppable"));

		Actions builder=new Actions(driver);
		//Action dragdrop= (Action)builder.clickAndHold(w1).moveToElement(w2).release(w2).build();
		Action dragdrop= builder.dragAndDrop(w1, w2).build();
		
		dragdrop.perform();
		
	}
}
