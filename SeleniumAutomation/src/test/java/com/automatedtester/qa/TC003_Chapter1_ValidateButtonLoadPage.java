package com.automatedtester.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC003_Chapter1_ValidateButtonLoadPage {
  
  @BeforeTest
  public void beforeTest() {
  }
  
  @Test
  public void TC003() throws InterruptedException {
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
	  Reporter.log("Click button \"load text to the page\"");
	  driver.findElement(By.xpath("//input[@id='secondajaxbutton']")).click();
	  Thread.sleep(3000);
	  
	  //Step 4
	  Reporter.log("Verify text box value inserted after click button \"load text to the page\"");
	  String texto = driver.findElement(By.xpath("//div[@id='html5div']")).getText();
	  System.out.println(texto); //Se imprime en consola el valor del campo luego de cargar el nuevo texto
	  
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
