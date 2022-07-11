/**

 * 
 */
package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.SearchResultPage;

/**
 * @author thinksysuser
 *
 */
public class AddToCartPageTest extends BaseClass {
	IndexPage indexPage;
	SearchResultPage searchResultPage;
	AddToCartPage addToCartPage;
	public AddToCartPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialisation();
		indexPage=new IndexPage();
		addToCartPage=new AddToCartPage(); 
	}
	@Test
	public void addToCartTest() throws IOException, InterruptedException {
		indexPage.searchProduct("Faded Short Sleeve T-shirts");
		
		addToCartPage=searchResultPage.clickOnProduct();
		addToCartPage.enterQuantity("2");
		addToCartPage.selectSize("M");
		addToCartPage.clickOnAddToCart();
		boolean result=addToCartPage.validateAddToCart();
		Assert.assertTrue(result);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
