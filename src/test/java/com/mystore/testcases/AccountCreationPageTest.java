package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class AccountCreationPageTest extends BaseClass{
	IndexPage indexPage;
	LoginPage loginPage;
	AccountCreationPage accountCreationPage;
	public AccountCreationPageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialisation();
		indexPage=new IndexPage();
		loginPage=	indexPage.clickOnSignIn();
	}
	
	
	@Test
	public void AccountCreationPageTest() throws IOException {
	accountCreationPage=loginPage.createNewAccount("dkfdkfj@gmail.com");
	boolean result=accountCreationPage.validateAccountCreatePage();
	Assert.assertTrue(result);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
