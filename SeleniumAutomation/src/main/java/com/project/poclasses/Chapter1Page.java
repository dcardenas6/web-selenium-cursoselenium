package com.project.poclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.base.Base;

public class Chapter1Page extends Base {

	public Chapter1Page(WebDriver driver) {
		super(driver);
	}
	
	By rad_unique = By.xpath("//input[@id='radiobutton']");
	By sdd_selenium = By.xpath("//select[@id='selecttype']");
	By link_homepage = By.xpath("//a[contains(text(),'Home Page')]");

	/**
	 * Click Radio button
	 * @author duban.cardenas
	 */
	
	public void clickRadio() {
		reporterLog("Click Radio button");
		waitForElementPresent(rad_unique);
		click(rad_unique);
	}
	
	/**
	 * Select Dropdown by Value in Chapter 1
	 * @author duban.cardenas
	 */
	
	public void selectTypeSelenium(String seleniumValue) {
		reporterLog("Select " + seleniumValue + " from dropdown");
		waitForElementPresent(sdd_selenium);
		selectByValueDropdown(sdd_selenium, seleniumValue);
		implicitlyWait(2);
	}
	
	/**
	 * Navigate Home page
	 * @author duban.cardenas
	 */
	
	public void navigateHomepage() {
		reporterLog("Click home page");
		waitForElementPresent(link_homepage);
		click(link_homepage);
	}
}
