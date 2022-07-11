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

import com.mystore.pageobjects.IndexPage;
import com.mystore.base.BaseClass;

/**
 * @author thinksysuser
 *
 */


public class IndexPageTest extends BaseClass {
	IndexPage indexPage;
	public IndexPageTest() throws IOException {
		super();
		 indexPage=new IndexPage();
		
	}

	@BeforeMethod
	public void setUp() {
		BaseClass.initialisation();
		
	}
	@Test
	public void myStoreLogoTest() {
		boolean Logo=indexPage.validateLogo();
		Assert.assertTrue(Logo);
	}
	
	@Test
	public void verifyTitleTest() {
		String title=indexPage.getMyStoreTitle();
		Assert.assertEquals(title, "My Store");
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
