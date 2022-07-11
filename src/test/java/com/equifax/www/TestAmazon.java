package com.equifax.www;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.equifax.www.pages.CheckoutPage;
import com.equifax.www.pages.HomePage;
import com.equifax.www.pages.ProductPage;
import com.equifax.www.pages.SearchPage;

public class TestAmazon extends BaseTest{
	@Test
	public void amazonTest() throws IOException, InterruptedException {
		String url = readProperties.getProperty("applicationURL");
		driver.get(url);
		HomePage homePage = new HomePage(driver);
		homePage.selectCategoryType(readProperties.getProperty("categoryName"));
		homePage.searchProductName(readProperties.getProperty("productName"));
		SearchPage searchPage = new SearchPage(driver);
		String productPrice = searchPage.selectFirstProduct();
		ProductPage productPage = new ProductPage(driver);
		productPage.validateProductPriceAndAddtoCart(productPrice);
		CheckoutPage checkOutPage = new CheckoutPage(driver);
		checkOutPage.validateCheckOutAmountAndProceedToCheckOut(productPrice);
	}

}
