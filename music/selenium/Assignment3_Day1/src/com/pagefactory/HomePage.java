package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='WebPartWPQ1']/div[1]/ul/li[4]/a")
	WebElement worldwide;
	
/*
	@FindBy(xpath=".//*[@id='ctl00_SPWebPartManager1_g_97bee3e1_1a6c_440f_9af5_3f7d217c5446']/div/div[2]/ul/li[5]/a")
	WebElement germany;*/
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WorldWidePage clickW(){
		worldwide.click();
		return new WorldWidePage(driver);
	}
	
	/*public void clickG()
	{
		germany.click();
	}*/
}
