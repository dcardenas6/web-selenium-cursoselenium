package com.project.poclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.base.Base;

public class HomePage extends Base{

	/**
	 * Constructor Base class
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Objects
	By link_chapter1 = By.xpath("//a[contains(text(),'Chapter1')]");
	By link_chapter2 = By.xpath("//a[@href='/chapter2']"); //También funciona //a[contains(text(),'Chapter2')]
	
	/**
	 * Click Chapter 1
	 * @author duban.cardenas
	 */
	
	public void clickChapter1() {
		reporterLog("Click Chapter 1");
		waitForElementPresent(link_chapter1);
		click(link_chapter1);
	}
	
	public void clickChapter2() {
		reporterLog("Click Chapter 2");
		waitForElementPresent(link_chapter2);
		click(link_chapter2);
	}

}
