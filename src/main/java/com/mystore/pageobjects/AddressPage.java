package com.mystore.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class AddressPage extends BaseClass {

	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	WebElement proceedToCheckOut;
	
	public AddressPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
}
	
	public ShippingPage clickOnProceedToCheckOut() throws IOException {
		Action.click(driver, proceedToCheckOut);
		return new ShippingPage();
	}

}
