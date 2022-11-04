package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;

public class HomePage extends ProjectSpecificMethods{
	@And("Home page is displayed")
	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}
	@And("Click Crm Link")
	public MyHomePage clickCrmsfaLink() {
		click(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
		reportStep("CRM/SFA link is clicked", "pass");
		return new MyHomePage();
	}
	
}
