package com.mystore.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class AddToCartPage extends BaseClass {

	
	@FindBy(id="quantity_wanted")
	WebElement quantity;
	
	@FindBy(name="group_1")
	WebElement size;
	
	@FindBy(xpath = "//span[text()='Add to cart'")
	WebElement addToCartBtn;

	@FindBy(xpath = "//*[@id='layer_cart']//h2/i")
	WebElement addToCartMsg;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckOutBtn;
	
	public AddToCartPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void enterQuantity(String quantity1) {
		Action.type(quantity, quantity1);
	}
	
	public void selectSize(String size1) {
		Action.selectByVisibleText(size1, size);
	}
	
	public void clickOnAddToCart() {
		Action.click(driver, addToCartBtn);
	}
	
	public boolean validateAddToCart() {
		Action.fluentWait(driver, addToCartMsg, 10);
		return	Action.isDisplayed(driver, addToCartMsg);
	}
	
	public OrderPage clickOnCheckOut() throws IOException {
		Action.JSClick(driver, proceedToCheckOutBtn);
		Action.fluentWait(driver, proceedToCheckOutBtn, 10);
		return new OrderPage();
		
	}
	
}
