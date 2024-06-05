package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

import com.demo.project.GenericMethod;

public class LoginPage  extends LoginOR{

    

    
    public GenericMethod gms;
    

    
    public LoginPage(GenericMethod gm) {
           this.gms = gm;
           gms.launchBrowser("chrome");
            PageFactory.initElements(gms.driver, this);
        
        }
    
    
//==========================================================================================================
    // Method to perform a valid login
    public void validLogin()  {
    
        gms.hitUrl("");
       
        gms.inputData(userName, "admin");
        gms.inputData(password, "admin");
        
        gms.click(loginBtn);
        
        
    }
}