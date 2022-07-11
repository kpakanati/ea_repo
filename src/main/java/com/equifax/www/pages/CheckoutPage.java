package com.equifax.www.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckoutPage {
	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='hlb-subcart']/div/span/span[2]")
	public WebElement TXT_CheckOutPrice;
	
	@FindBy(id="hlb-ptc-btn")
	public WebElement BTN_ProceedToCheckOut;
	
	public void validateCheckOutAmountAndProceedToCheckOut(String expectedPrice) {
		Assert.assertEquals(TXT_CheckOutPrice.getText(), expectedPrice,"Incorrect checkout price");
		BTN_ProceedToCheckOut.click();
	}

}
