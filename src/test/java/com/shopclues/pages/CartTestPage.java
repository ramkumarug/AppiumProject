package com.shopclues.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class CartTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "btn.addToCart.cart")
	private QAFWebElement btnAddToCartCart;
	@FindBy(locator = "icon.addToCart.cart")
	private QAFWebElement iconAddToCartCart;
	@FindBy(locator = "txt.mobilename.addToCart")
	private QAFWebElement txtMobilenameAddToCart;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getBtnAddToCartCart() {
		return btnAddToCartCart;
	}

	public QAFWebElement getIconAddToCartCart() {
		return iconAddToCartCart;
	}

	public QAFWebElement getTxtMobilenameAddToCart() {
		return txtMobilenameAddToCart;
	}

}
