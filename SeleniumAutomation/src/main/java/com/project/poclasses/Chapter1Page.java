package com.project.poclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.project.base.Base;

public class Chapter1Page extends Base {

	public Chapter1Page(WebDriver driver) {
		super(driver);
	}
	
	By rad_unique = By.xpath("//input[@id='radiobutton']");
	By sdd_selenium = By.xpath("//select[@id='selecttype']");
	By link_homepage = By.xpath("//a[contains(text(),'Home Page')]");
	By txt_assert = By.xpath("//div[@id='divontheleft']");
	By btn_ajax = By.xpath("//input[@id='secondajaxbutton']");
	By txt_verify = By.xpath("//div[@id='html5div']/div");

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
	
	/**
	 * Validate text
	 * @author duban.cardenas
	 * @param validar
	 */
	public void assertText(String validar) {
		reporterLog("Validate \"" + validar + "\" text");
		waitForElementPresent(txt_assert);
		String actual = textFromObject(txt_assert);
		Assert.assertEquals(actual, validar);
		System.out.println("Si coinciden los textos");
	}
	
	/**
	 * click button to load text
	 * @author duban.cardenas
	 */
	public void clickButton() {
		reporterLog("Click button \"load text to the page\"");
		waitForElementPresent(btn_ajax);
		click(btn_ajax);
		implicitlyWait(3);
	}
	
	/**
	 * Verify text on text Area
	 * @author duban.cardenas
	 * @param verificar
	 */
	public void verifyText(String verificar) {
		reporterLog("Verify text: " + verificar);
		waitForElementPresent(txt_verify);
		String textbox = textFromObject(txt_verify);
		Assert.assertEquals(textbox, verificar);
		System.out.println(textbox);
	}
}
