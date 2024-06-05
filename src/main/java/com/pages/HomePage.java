package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.demo.project.GenericMethod;

public class HomePage extends HomePageOr {
	
	private GenericMethod gmObj;
	
public 	HomePage(GenericMethod gm) {
	this.gmObj=gm;
	PageFactory.initElements(gmObj.driver, this);
	
	
}
public void marketing() {
	gmObj.moveToElrmrnt(marketing);
}
	
public void account() {
gmObj.click(account);	


}
public void alfawet() {
gmObj.GetTextAllElement(listweElement);	
}
	

}
