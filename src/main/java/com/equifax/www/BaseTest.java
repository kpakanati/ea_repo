package com.equifax.www;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public static WebDriver driver;
	ReadProperty readProperties;
	@BeforeMethod
	public void openBrowser() throws IOException {
		readProperties = new ReadProperty();
		String browserName=readProperties.getProperty("browsername");
		Browsers browsers=new Browsers();
		if(browserName.equals("chrome")) {
			driver=browsers.openChromeBrowser();
		}
	}
	

}
