package com.mystore.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class OrderSummary extends BaseClass {

	
	@FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
	WebElement confirmOrderBtn;
	
	public OrderSummary() throws IOException {
		super();
	PageFactory.initElements(driver, this);
	}
	
	public OrderConfirmationPage clickOnconfirmOrderBtn() throws IOException {
		Action.click(driver, confirmOrderBtn);
		return new OrderConfirmationPage();
	}

}
