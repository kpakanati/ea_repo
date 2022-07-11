package com.equifax.www.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) throws InterruptedException {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	@FindBy(name="url")
	public WebElement getCategoryDD;
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement getProductNameTextBox;
	
	@FindBy(id="nav-search-submit-button")
	public WebElement getsearchButton;
	
	public void selectCategoryType(String categoryName) {
		Select dd=new Select(getCategoryDD);
		dd.selectByVisibleText(categoryName);
	}
	public void searchProductName(String productName) {
		getProductNameTextBox.sendKeys(productName);
		getsearchButton.click();
		
	}
}
