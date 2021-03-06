package com.actitime.businesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.actime.pageobjectrepository.ActiveProjectAndCust;
import com.actime.pageobjectrepository.CreateNewCustomer;
import com.actime.pageobjectrepository.OpenTasks;
import com.actime.pageobjectrepository.TimeTrack;
import com.acttime.genericlib.Driver;
import com.acttime.genericlib.WebDriverCommonLib;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class ProjectAndCustomerLib extends WebDriverCommonLib{
	TimeTrack timePage = PageFactory.initElements(Driver.driver, TimeTrack.class);
	OpenTasks taskPage = PageFactory.initElements(Driver.driver, OpenTasks.class);
	ActiveProjectAndCust actPage = PageFactory.initElements(Driver.driver, ActiveProjectAndCust.class);
	CreateNewCustomer createNewCustPage = PageFactory.initElements(Driver.driver, CreateNewCustomer.class);
	
	
	public void navigateToTaskPage(){
		timePage.getTaskImg().click();
		waitForPageToLoad();
	}
	
	public void navigateToCreateCustomerPage(){
		taskPage.getProjAndCustLnk().click();
		waitForPageToLoad();
	}
	
	public void createCustomer(String customerName){
		//Driver.driver.findElement(By.xpath("//div[@id='ext-comp-1002']")).click();
		actPage.getCreatNewCustomer().click();
		waitForPageToLoad();
		createNewCustPage.getCustomerNameEdt().sendKeys(customerName);
		createNewCustPage.getCreateCustBtn().click();
		waitForPageToLoad();
	}
	
	
	public void navigateToCustomerDeatilsPAge(String customerName){
		select(actPage.getCustShowLst(),customerName);
		waitForPageToLoad();
		actPage.getShowBtn().click();
		waitForPageToLoad();
		Driver.driver.findElement(By.linkText(customerName)).click();
		waitForPageToLoad();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
