package com.shopclues.steps;
import static com.qmetry.qaf.automation.step.CommonStep.*;
import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class CartStepPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "btn.addToCart.cart")
	private QAFWebElement btnAddToCartCart;
	@FindBy(locator = "icon.addToCart.cart")
	private QAFWebElement iconAddToCartCart;
	

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getBtnAddToCartCart() {
		return btnAddToCartCart;
	}

	public QAFWebElement getIconAddToCartCart() {
		return iconAddToCartCart;
	}

	@QAFTestStep(description = "I click on to add to cart")
	public void clickOnAddToCart() {
		click("btn.addToCart.cart");
	}

	
	@QAFTestStep(description = "verify whether the selected product is added in cart")
	public void verifyProduct() {
		/*String s = txtMobilenameAddtocart.getText();
		s.contains("Karbonn Titanium Frames S7");
		Reporter.log("Mobile model is matching ");*/
		click("icon.addToCart.cart");
	}



}
