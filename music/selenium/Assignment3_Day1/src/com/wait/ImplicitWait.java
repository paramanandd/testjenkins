package com.wait;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class ImplicitWait {
	
	@Test
	public void test()
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.get("http://www.makemytrip.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div/div[2]/ul/li[2]/a")).click();
	driver.findElement(By.xpath(".//*[@id='one_way_button1']/span")).click();
	driver.findElement(By.xpath(".//*[@id='from_typeahead1']")).clear();
	driver.findElement(By.xpath(".//*[@id='from_typeahead1']")).sendKeys("pune");;
	driver.findElement(By.xpath(".//*[@id='to_typeahead1']")).clear();
	driver.findElement(By.xpath(".//*[@id='to_typeahead1']")).sendKeys("goa");
	driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[2]")).click();
	
	WebElement datewidget=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]"));
	List<WebElement> columns=datewidget.findElements(By.tagName("td"));
	
	String str="20";
	for (WebElement webElement : columns) {
		if(webElement.getText().equals(str))
		{
			webElement.click();
			break;
		}
	}
	
	driver.findElement(By.xpath(".//*[@id='flights_submit']")).click();
	
	
	FluentWait<WebDriver> waitf=new FluentWait<WebDriver>(driver)
				.withTimeout(1, TimeUnit.SECONDS)
				.pollingEvery(100, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);
	
	WebElement modifysearch=waitf.until(new Function<WebDriver,WebElement>() {
		public WebElement apply(WebDriver driver){
			WebElement modify=driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/div[1]/div[1]/div/div[1]/div/div[2]/a"));
			return modify;
		}
	});
	WebDriverWait wait = new WebDriverWait(driver, 2);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='content']/div/div[1]/div[1]/div[1]/div/div[1]/div/div[2]/a")));
	modifysearch.click();
	}
}
