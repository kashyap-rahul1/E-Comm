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
public class AccountCreationPage extends BaseClass {

	

	@FindBy(xpath = "//h1[text()='Create an account']")
	WebElement formTitle;
	
	public AccountCreationPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateAccountCreatePage() {
		return	Action.isDisplayed(driver, formTitle);
	}
	
	
}
