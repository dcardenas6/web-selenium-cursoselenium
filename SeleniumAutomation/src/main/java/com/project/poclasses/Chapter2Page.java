package com.project.poclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.project.base.Base;

public class Chapter2Page extends Base {
	
	public Chapter2Page(WebDriver driver) {
		super(driver);
	}
	
	By btn_verify = By.xpath("//input[@name='verifybutton1']");
	By btn_index = By.xpath("//a[@href='/']");

	public void clickVerify() {
		reporterLog("Click and validate name of button \"chocolate\"");
		waitForElementPresent(btn_verify);
		click(btn_verify);
		implicitlyWait(3);
	}
	
	public void verifyText(String verificar) {
		reporterLog("Validate name of button \"chocolate\"");
		waitForElementPresent(btn_verify);
		String texto = valueFromObject(btn_verify);
		Assert.assertEquals(texto, verificar);
		System.out.println("El botón dice: " + texto);
	}
	
	public void navigateIndex() {
		reporterLog("Click link \"Index\"");
		waitForElementPresent(btn_index);
		click(btn_index);
		implicitlyWait(3);
	}
}
