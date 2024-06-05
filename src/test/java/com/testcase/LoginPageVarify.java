package com.testcase;



import org.testng.annotations.Test;

import com.demo.project.GenericMethod;
import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginPageVarify {
	

@Test
	public static void m1() {
		GenericMethod gm=	new GenericMethod();
		//gm.launchBrowser("firefox");
		LoginPage lg= new LoginPage(gm) ;	
		lg.validLogin();
	HomePage hp=	new HomePage(gm);
	hp.marketing();
	hp.account();
	hp.alfawet();
		
	}
}
