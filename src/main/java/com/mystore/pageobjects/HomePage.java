/**
 * 
 */
package com.mystore.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author thinksysuser
 *
 */
public class HomePage extends BaseClass {

	
	

	@FindBy(xpath = "//a[@title='My wishlists']//span[contains(text(),'My wishlists')]")
	WebElement myWishList;
	
	@FindBy(xpath = "//span[text()='Order history and details']")
	WebElement orderHistory;
	
	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateMyWishList() {
		return Action.isDisplayed(driver, myWishList);
	}
	
	
	public boolean  validateOrderHistory() {
		return	Action.isDisplayed(driver, orderHistory);
	}
	
	public String getCurrURL() {
		String homePageURL	=driver.getCurrentUrl();
		return homePageURL;
	}

}
