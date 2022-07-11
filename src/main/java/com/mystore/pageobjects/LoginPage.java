package com.mystore.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass {
			

	@FindBy(xpath = "//input[@id='email']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement signInBtn;
	
	@FindBy(name="email_create")
	WebElement emailForNewAccount;
	
	@FindBy(name="SubmitCreate")
	WebElement createNewAccountBtn;
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public HomePage login(String uname, String pswed) throws IOException {
		Action.type(userName, uname);
		Action.type(password, pswed);
		Action.click(driver, signInBtn);
		return new HomePage();
	}
	
	public AddressPage login1(String uname, String pswed) throws IOException {
		Action.type(userName, uname);
		Action.type(password, pswed);
		Action.click(driver, signInBtn);
		return new AddressPage();
	}
	
	public AccountCreationPage createNewAccount(String newEmail) throws IOException {
		Action.type(emailForNewAccount, newEmail);
		Action.click(driver, createNewAccountBtn);
		return new AccountCreationPage();
	}
	

	
	
}
