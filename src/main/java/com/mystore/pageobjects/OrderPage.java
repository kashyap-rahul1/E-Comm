package com.mystore.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class OrderPage extends BaseClass{

	

	@FindBy(xpath ="//span[@id='product_price_1_1_0']//span[@class='price']" )
	WebElement unitPrice;
	
	@FindBy(xpath = "//span[@id='total_product_price_1_1_0']")
	WebElement totalPrice;
		
	@FindBy(xpath = "//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckOut;
	
	public OrderPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public double getUnitPrice() {
		String unitPrice1=unitPrice.getText();
		String unit=unitPrice1.replaceAll("[^a-zA-Z0-9]", "");
		double finalUnitPrice=	Double.parseDouble(unit);
		return finalUnitPrice/100;
	}
	
	public double getTotalPrice() {
		String totalPrice1=unitPrice.getText();
		String total=totalPrice1.replaceAll("[^a-zA-Z0-9]", "");
		double finalTotalPrice=	Double.parseDouble(total);
		return finalTotalPrice/100;
	}
	
	public LoginPage clickOnCheckOut() throws IOException {
		Action.click(driver, proceedToCheckOut);
		return new LoginPage();
	}
}
