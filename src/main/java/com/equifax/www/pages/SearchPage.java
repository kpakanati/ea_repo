package com.equifax.www.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	private By LST_FirstProduct() {
		return By.xpath("//div[@data-cel-widget='search_result_1']");
	}
	private By LNK_Product() {
		return By.xpath(".//h2/a");
	}
	private By TXT_ProductPrice() {
		return By.className("a-price");
	}
	
	
	public String selectFirstProduct() {
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(LST_FirstProduct()));
		String productPrice=driver.findElement(LST_FirstProduct()).findElement(TXT_ProductPrice()).getText();
		productPrice=productPrice.replaceAll("\n", ".");
		driver.findElement(LST_FirstProduct()).findElement(LNK_Product()).click();
		return productPrice;
	}

}
