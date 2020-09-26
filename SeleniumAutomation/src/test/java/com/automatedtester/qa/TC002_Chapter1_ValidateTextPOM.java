package com.automatedtester.qa;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.base.Base;
import com.project.base.GlobalVariables;
import com.project.poclasses.Chapter1Page;
import com.project.poclasses.HomePage;

public class TC002_Chapter1_ValidateTextPOM {
	
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
  public void TC002() throws IOException {
	  
	//STEP 1
	base.launchBrowser(GlobalVariables.SELENIUM_MAIN_URL);

	//STEP 2
	home.clickChapter1();
	
	//STEP 3
	chapter1.selectTypeSelenium("Selenium IDE");
	
	//STEP 4
	chapter1.assertText("Assert that this text is on the page");
	
	//STEP 5
	chapter1.navigateHomepage();
  }

  @AfterTest
  public void afterTest() {
	  //STEP 6
	  base.closeBrowser();
  }

}
