package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;




public class LoginOR {
	// Page elements for the login page
    @FindBy(xpath = "//input[@name='user_name']")
    protected WebElement userName;

    @FindBy(xpath = "//input[@name='user_password']")
    protected WebElement password;

    @FindBy(xpath = "//input[@name='Login']")
    protected WebElement loginBtn;
	
//public WebElement getuserName() {
//	return userName;
//}
//
//public WebElement getpassword() {
//	return password;
//}
}
