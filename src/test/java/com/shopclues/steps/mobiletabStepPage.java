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

public class mobiletabStepPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "option.mobilemodel.mobileTabPage")
	private QAFWebElement model;
	@FindBy(locator = "option.smartphone.mobileTabPage")
	private QAFWebElement smartPhone;
	@FindBy(locator = "option.mobile.mobileTabPage")
	private QAFWebElement mobile;
	@FindBy(locator = "txt.mobilename.addToCart")
	private QAFWebElement txtMobilenameAddtocart;
	@FindBy(locator = "txt.secondprice.addToCart")
	private QAFWebElement txtSecondpriceAddtocart;
	@FindBy(locator = "txt.thirdprice.addToCart")
	private QAFWebElement txtThirdpriceAddtocart;
	@FindBy(locator = "txt.firstprice.addToCart")
	private QAFWebElement txtFirstpriceAddtocart;
	@FindBy(locator = "txt.offerpercent.addToCart")
	private QAFWebElement txtOfferpercentAddtocart;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOptionMobilemodelMobileTabPage() {
		return mobile;
	}

	public QAFWebElement getOptionSmartphoneMobileTabPage() {
		return smartPhone;
	}

	public QAFWebElement getOptionMobileMobileTabPage() {
		return model;
	}

	@QAFTestStep(description = "I click on to mobile phones options")
	public void clickOnMobiles() {
		click("option.mobile.mobileTabPage");
	}

	@QAFTestStep(description = "I click on to smart phones")
	public void clickOnSmartPhones() {
		clear("option.smartphone.mobileTabPage");
	}

	
	@QAFTestStep(description = "I click on to mobile model")
	public void clickOnMobileModel() {
		String name = txtMobilenameAddtocart.getText();
		String firstPrice = txtFirstpriceAddtocart.getText();
		String secondPrice = txtSecondpriceAddtocart.getText();
		String thirdPrice = txtThirdpriceAddtocart.getText();
		String offerPercentage = txtOfferpercentAddtocart.getText();
		Reporter.log(name);
		Reporter.log(firstPrice);
		Reporter.log(secondPrice);
		Reporter.log(thirdPrice);
		Reporter.log(offerPercentage);
		
		
		click("option.mobilemodel.mobileTabPage");
	}
	
	public QAFWebElement getTxtMobilenameAddtocart() {
		return txtMobilenameAddtocart;
	}

	public QAFWebElement getTxtSecondpriceAddtocart() {
		return txtSecondpriceAddtocart;
	}

	public QAFWebElement getTxtThirdpriceAddtocart() {
		return txtThirdpriceAddtocart;
	}

	public QAFWebElement getTxtFirstpriceAddtocart() {
		return txtFirstpriceAddtocart;
	}

	public QAFWebElement getTxtOfferpercentAddtocart() {
		return txtOfferpercentAddtocart;
	}

}
