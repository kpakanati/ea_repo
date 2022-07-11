package com.equifax.www.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage {
	WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	@FindBy(id="newBuyBoxPrice")
	public WebElement TXT_ProductPrice;
	
	@FindBy(id="add-to-cart-button")
	public WebElement BTN_AddToCart;
	
	public void validateProductPriceAndAddtoCart(String expectedPrice) {
		Assert.assertEquals(TXT_ProductPrice.getText(),expectedPrice,"Incorrect product price");
		BTN_AddToCart.click();
	}
}
