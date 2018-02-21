package com.shopclues.tests;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;
import com.shopclues.pages.CartTestPage;
import com.shopclues.pages.HomeTestPage;
import com.shopclues.pages.MobiletabTestPage;


public class OnlinePurchase extends WebDriverTestCase {
	
	@Test
	public void orderProduct() {
	HomeTestPage h=new HomeTestPage();
	h.getIconMenuHomepage().click();
	h.getIconMobilesandtabsHomepage().click();
	
	
	MobiletabTestPage m=new MobiletabTestPage();
	m.getOptionMobileMobileTabPage().click();
	m.getOptionSmartphoneMobileTabPage().click();
	m.productInfo();	
	m.getOptionMobilemodelMobileTabPage().click();
	
	
	CartTestPage c=new CartTestPage();
	c.getBtnAddToCartCart().click();
	c.getIconAddToCartCart().click();
	}

}
