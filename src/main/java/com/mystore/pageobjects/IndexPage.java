package com.mystore.pageobjects;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass{

	
	@FindBy(xpath = "//a[@class='login']")
	WebElement signInBtn;
	
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	WebElement myStoreLogo;
	
	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement searchProductBox;
	
	@FindBy(xpath = "//button[@name='submit_search']")
	WebElement searchButton;
	
	public IndexPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public LoginPage clickOnSignIn() throws IOException {
		Action.click(driver, signInBtn);
		return new LoginPage();
	}
	
	public boolean validateLogo() {
		return	Action.isDisplayed(driver, myStoreLogo);
	}
	
	public String getMyStoreTitle() {
		return driver.getTitle();
	}
	
	public SearchResultPage searchProduct(String productName) throws IOException, InterruptedException {
		Action.type(searchProductBox, productName);
		Action.click(driver, searchButton);
		return new SearchResultPage();
	}

	
	
}
