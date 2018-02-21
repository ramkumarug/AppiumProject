package com.shopclues.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class MobiletabTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "option.mobilemodel.mobileTabPage")
	private QAFWebElement optionMobilemodelMobileTabPage;
	@FindBy(locator = "option.smartphone.mobileTabPage")
	private QAFWebElement optionSmartphoneMobileTabPage;
	@FindBy(locator = "option.mobile.mobileTabPage")
	private QAFWebElement optionMobileMobileTabPage;
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
		return optionMobilemodelMobileTabPage;
	}

	public QAFWebElement getOptionSmartphoneMobileTabPage() {
		return optionSmartphoneMobileTabPage;
	}

	public QAFWebElement getOptionMobileMobileTabPage() {
		return optionMobileMobileTabPage;
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
	

	@FindBy(locator="component.productInfo.addToCart") 
	private QAFWebElement componentProductinfoAddtocart;


	public QAFWebElement getComponentProductinfoAddtocart(){
		
		return componentProductinfoAddtocart;
		}
	
	public void productInfo() {
		String name = txtMobilenameAddtocart.getText();
		String firstPrice = txtFirstpriceAddtocart.getText();
		String secondPrice = txtSecondpriceAddtocart.getText();
		String thirdPrice = txtThirdpriceAddtocart.getText();
		String offerPercentage = txtOfferpercentAddtocart.getText();
		Reporter.log("Product Description");
		Reporter.log("The name of teh product is :"+name);
		Reporter.log("The first price of the product is :"+firstPrice);
		Reporter.log("The second price of the product is :"+secondPrice);
		Reporter.log("The third price of the product is :"+thirdPrice);
		Reporter.log("The offer percentage of the product is :"+offerPercentage);
		
	}



}
