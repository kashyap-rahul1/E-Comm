/**
 * 
 */
package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

/**
 * @author thinksysuser
 *
 */

public class HomePageTest extends BaseClass {

	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialisation();
		indexPage = new IndexPage();
		loginPage=new LoginPage();
		loginPage = indexPage.clickOnSignIn();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void wishListTest() {
		boolean result=	homePage.validateMyWishList();
		Assert.assertTrue(result);
	}
	
	@Test
	public void validateOrderHistoryTest() {
		boolean orderHistory=homePage.validateOrderHistory();
		Assert.assertTrue(orderHistory);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
