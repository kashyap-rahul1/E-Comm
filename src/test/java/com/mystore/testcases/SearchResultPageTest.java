/**
 * 
 */
package com.mystore.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
public class SearchResultPageTest extends BaseClass{
	IndexPage indexPage;
	SearchResultPage searchResultPage;
	AddToCartPage addToCartPage;
	public SearchResultPageTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialisation();
		indexPage=new IndexPage();
	}
	
	@Test
	public void productAvailablityTest() throws IOException, InterruptedException {
		searchResultPage=indexPage.searchProduct("Faded Short Sleeve T-shirts");
		boolean result=searchResultPage.isProductAvailable();
		Assert.assertTrue(result);
	}
	@Test
	public void clickOnProduct() throws IOException, InterruptedException {
	 addToCartPage = searchResultPage.clickOnProduct();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
