package com.automatedtester.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_Chapter1_ValidateDropdown {
 
  @BeforeTest
  public void beforeTest() {
  }

  @Test
  public void TC001() throws InterruptedException {
	  
	  //Step 1
	  Reporter.log("Launch automatedtester app");
	  System.setProperty("webdriver.chrome.driver", "./Drivers/Chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://book.theautomatedtester.co.uk/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  Thread.sleep(3000);
	  
	  //Step 2
	  Reporter.log("Click link chapter 1");
	  driver.findElement(By.xpath("//a[contains(text(),'Chapter1')]")).click();
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='radiobutton']")));
	  Thread.sleep(3000);
	  
	  //Step 3
	  Reporter.log("Click Radio button");
	  driver.findElement(By.xpath("//input[@id='radiobutton']")).click();
	  Thread.sleep(3000);
	  
	  //Step 4
	  Reporter.log("Select \"Selenium Core\" from dropdown\n");
	  Select dd_selenium = new Select(driver.findElement(By.xpath("//select[@id='selecttype']")));
	  dd_selenium.selectByValue("Selenium Code");
	  Thread.sleep(3000);
	  
	  //Step 5
	  Reporter.log("Navigate Home page clicking \"Home Page\" link\n");
	  driver.findElement(By.xpath("//a[contains(text(),'Home Page')]"));
	  Thread.sleep(3000);
	  
	  //Step 6
	  Reporter.log("Close Browser");
	  driver.close();
	  
  }
  
  @AfterTest
  public void afterTest() {
  }

}
