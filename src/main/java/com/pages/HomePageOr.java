package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageOr {
	
	@FindBy(xpath = "//a[text()='Marketing']")
protected WebElement marketing;
	
	@FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Accounts']")
     protected WebElement account;
	
	
	

    @FindBy(xpath = "//td[@class='searchAlph']")
    protected List<WebElement> listweElement;
    
    
    
    
    
    
//    @FindBys({
//        @FindBy(xpath = "//td"),
//        @FindBy(className = "searchAlph")
//    })
//    protected List<WebElement> listweElemen1t;

	
	
	
	
}
