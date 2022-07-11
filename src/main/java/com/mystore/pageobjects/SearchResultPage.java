package com.mystore.pageobjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class SearchResultPage extends BaseClass {
	
	

	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
//	@FindBy(xpath="//*[@id=\"center_column\"]//img")

	private WebElement productResult;
//	WebElement productResult;
	
	public SearchResultPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean isProductAvailable() {
		return Action.isDisplayed(driver, productResult);
	}
	
	public AddToCartPage clickOnProduct() throws IOException, InterruptedException {
	
		Action.click(driver, productResult);
		return new AddToCartPage();
	}
	
}
