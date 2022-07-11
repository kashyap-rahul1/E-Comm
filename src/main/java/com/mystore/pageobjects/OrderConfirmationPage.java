package com.mystore.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class OrderConfirmationPage extends BaseClass {

	
	@FindBy(xpath = "//p//strong[contains(text(),'Your order on My Store is complete')]")
	WebElement confirmMessag;
	
	public OrderConfirmationPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String validateConfirmMessage() {
		
		String confirmMsg=confirmMessag.getText();
		return confirmMsg;
	
		
	}
	

}
