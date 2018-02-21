package com.shopclues.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

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

}
