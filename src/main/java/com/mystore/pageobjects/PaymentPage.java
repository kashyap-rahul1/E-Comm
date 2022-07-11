package com.mystore.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class PaymentPage extends BaseClass {

	@FindBy(xpath = "//a[contains(text(),'Pay by bank wire')]")
	WebElement bankWireMethod;
	
	@FindBy(xpath = "//a[contains(text(),'Pay by check')]")
	WebElement payByCheckMethod;
	
	public PaymentPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public OrderSummary clickOnPaymentMethod() throws IOException {
		Action.click(driver, bankWireMethod);
		return new OrderSummary();
	}

}
