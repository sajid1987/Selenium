package com.actime.pageobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerInfo {
	
	//@FindBy(className="formsummarytext")
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder']")
	private WebElement customerInfo;

	public WebElement getCustomerInfo() {
		return customerInfo;
	}
}
