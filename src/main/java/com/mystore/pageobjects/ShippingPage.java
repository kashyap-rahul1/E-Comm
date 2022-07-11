package com.mystore.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class ShippingPage extends BaseClass {

	
	@FindBy(id="cgv")
	WebElement terms;
	
	@FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckOutBtn;
	
	public ShippingPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void checkTheTerms() {
		Action.click(driver, terms);
	}
	
	public PaymentPage clickOnProceedToCheckOut() throws IOException {
		Action.click(driver, proceedToCheckOutBtn);
		return new PaymentPage();
	}

}
