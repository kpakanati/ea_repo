package com.equifax.www;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void test1() throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("Config.properties");
		prop.load(fis);
		String url=prop.getProperty("applicationURL");
		driver.get(url);
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		FluentWait wait = new FluentWait(driver);
		//Specify the timout of the wait
		wait.withTimeout(5000, TimeUnit.MILLISECONDS).pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-nav-ref='nav_custrec_signin']")));
		driver.findElement(By.xpath("//a[@data-nav-ref='nav_custrec_signin']")).click();
	}

}
