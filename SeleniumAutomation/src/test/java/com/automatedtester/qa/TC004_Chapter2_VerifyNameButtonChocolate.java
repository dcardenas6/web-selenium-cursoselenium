package com.automatedtester.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.base.Base;
import com.project.base.GlobalVariables;
import com.project.poclasses.Chapter2Page;
import com.project.poclasses.HomePage;

public class TC004_Chapter2_VerifyNameButtonChocolate {

	WebDriver driver;
	HomePage home;
	Base base;
	Chapter2Page chapter2;
	
	@BeforeTest
	public void beforeTest() {
		base = new Base(driver);
		driver = base.chromedriverConnection();
		home = new HomePage(driver);
		chapter2 = new Chapter2Page(driver);
	}

	@Test
	public void TC004() {
		
		//STEP 1
		base.launchBrowser(GlobalVariables.SELENIUM_MAIN_URL);
		
		//STEP 2
		home.clickChapter2();
		
		//STEP 3
		chapter2.clickVerify();
		chapter2.verifyText("chocolate");
		
		//STEP 4
		chapter2.navigateIndex();
	}

	@AfterTest
	public void afterTest() {
		//STEP 5
		base.closeBrowser();
	}

}
