package com.automatedtester.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002_Chapter1_ValidateText {
  
  @BeforeTest
  public void beforeTest() {
  }

  @Test
  public void TC002() throws InterruptedException {
	  
	  //Step 1
	  Reporter.log("Open Browser \"the automated tester\" page");
	  System.setProperty("webdriver.chrome.driver", "./Drivers/Chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://book.theautomatedtester.co.uk/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  Thread.sleep(3000);
	  
	  //Step 2
	  Reporter.log("Click Link \"Chapter 1\"");
	  driver.findElement(By.xpath("//a[contains(text(),'Chapter1')]")).click();
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='selecttype']")));
	  Thread.sleep(3000);
	  
	  //Step 3
	  Reporter.log("Select \"Selenium IDE\" from dropdown");
	  Select dd_selenium = new Select(driver.findElement(By.xpath("//select[@id='selecttype']")));
	  dd_selenium.selectByValue("Selenium IDE");
	  Thread.sleep(3000);
	  
	  //Step 4
	  Reporter.log("Validate text Assertion");
	  String actual = driver.findElement(By.xpath("//div[@id='divontheleft']")).getText();
	  String esperado = "Assert that this text is on the page";
	  System.out.println(actual);
	  Assert.assertEquals(actual,esperado); //si no coinciden la aplicación falla
	  System.out.println("Texto Coincide, bien hecho!");
	  
	  //Step 5
	  Reporter.log("Navigate Home page clicking \"Home Page\" link");
	  driver.findElement(By.xpath("//a[contains(text(),'Home Page')]")).click();
	  Thread.sleep(3000);
	  
	  //Step 6
	  Reporter.log("Close Browser");
	  driver.close();
  }

  @AfterTest
  public void afterTest() {
  }

}
