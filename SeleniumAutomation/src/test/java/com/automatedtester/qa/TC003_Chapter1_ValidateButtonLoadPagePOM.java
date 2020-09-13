package com.automatedtester.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.base.Base;
import com.project.base.GlobalVariables;
import com.project.poclasses.Chapter1Page;
import com.project.poclasses.HomePage;

public class TC003_Chapter1_ValidateButtonLoadPagePOM {

	WebDriver driver;
	Base base;
	HomePage home;
	Chapter1Page chapter1;

	@BeforeTest
	public void beforeTest() {

		base = new Base(driver);
		driver = base.chromedriverConnection();
		home = new HomePage(driver);
		chapter1 = new Chapter1Page(driver);
	}

	@Test
	public void TC003() {

		// STEP 1
		base.launchBrowser(GlobalVariables.SELENIUM_MAIN_URL);

		// STEP 2
		home.clickChapter1();

		// STEP 3
		chapter1.clickButton();
		
		// STEP 4
		chapter1.verifyText("I have been added with a timeout");
		
		// STEP 5
		chapter1.navigateHomepage();

	}

	@AfterTest
	public void afterTest() {
		// STEP 6
		//base.closeBrowser();
	}

}
