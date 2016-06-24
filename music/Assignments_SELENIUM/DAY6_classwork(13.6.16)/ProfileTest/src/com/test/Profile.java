package com.test;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Profile {

	@Test
		public void Test1()
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		String chromeProfile = "C:\\";
		ArrayList<String> switches = new ArrayList<String>();
		switches.add("--user-data-dir=" + chromeProfile);
		capabilities.setCapability("chrome.switches", switches);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("http://www.google.com");
		}
}
