package com.shopclues.steps;
import static com.qmetry.qaf.automation.step.CommonStep.*;

import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomeStepPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "icon.menu.homepage")
	private QAFWebElement iconMenuHomepage;
	@FindBy(locator = "icon.mobilesandtabs.homepage")
	private QAFWebElement iconMobilesandtabsHomepage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getIconMenuHomepage() {
		return iconMenuHomepage;
	}

	public QAFWebElement getIconMobilesandtabsHomepage() {
		return iconMobilesandtabsHomepage;
	}

	
	 
	@QAFTestStep(description = "I open the shopclues application")
	public void openApp() {

driver.get("/");
	}
	
	@QAFTestStep(description = "I click on to menu icon")
	public void clickOnMenu() {
		click("icon.menu.homepage");
		
		
	}
	
	@QAFTestStep(description = "I click on to mobiles and tablets tab")
	public void clickOnMobileAndTab() {
	click("icon.mobilesandtabs.homepage");	
	}

}
