package com.draggable;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
public class Profile {
	@Test
	public void test() throws IOException
	{
		ProfilesIni profile=new ProfilesIni();
		FirefoxProfile fp=profile.getProfile("Test");
		fp.addExtension(new File("D:\\firebug-2.0.17-fx.xpi"));
		WebDriver driver=new FirefoxDriver(fp);
		
		driver.get("http://www.cybage.com");
		
		
	/*	FirefoxProfile fp=new FirefoxProfile();
		fp.setPreference("browser.download.folderList", 2);
		fp.setPreference("browser.download.dir", "D:\\");
		fp.setPreference("browser.startup.homepage","http://www.cybage.com");
		fp.addExtension(new File("D:\\firebug-2.0.17-fx.xpi"));
		DesiredCapabilities dc=DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, fp);
		WebDriver driver=new FirefoxDriver(dc);*/
		
		
		
	}
}
