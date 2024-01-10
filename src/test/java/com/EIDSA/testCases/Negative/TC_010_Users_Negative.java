package com.EIDSA.testCases.Negative;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.UserPage;

import Base.BaseClassTest;

public class TC_010_Users_Negative extends BaseClassTest{
	
	//without filling mandatory and optional field
		@Test(priority=1)
		public void negativeTest1() throws InterruptedException
		{
			UserPage up=new UserPage(driver);
			up.clickUser();
			up.createUser_Negative();
			SoftAssert softAssert = new SoftAssert();
			String ActualErrorMEssage1 = driver.findElement(By.xpath("//span[contains(text(),'Please enter first name.')]")).getText();	
		    String ActualErrorMEssage2 = driver.findElement(By.xpath("//span[contains(text(),'Please enter last name.')]")).getText();
	        String ActualErrorMEssage3 = driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid email address.')]")).getText();
			String ActualErrorMEssage4 = driver.findElement(By.xpath("//span[contains(text(),'Please select a user type.')]")).getText();
	        String ActualErrorMEssage5 = driver.findElement(By.xpath("//span[contains(text(),'Please select role.')]")).getText();
		    softAssert.assertEquals(ActualErrorMEssage1, "Please enter first name.");
			softAssert.assertEquals(ActualErrorMEssage2, "Please enter last name.");
			softAssert.assertEquals(ActualErrorMEssage3, "Please enter a valid email address.");
			softAssert.assertEquals(ActualErrorMEssage4, "Please select a user type.");
			softAssert.assertEquals(ActualErrorMEssage5, "Please select role.");
			softAssert.assertAll();
			logger.info("Negative test1 passed"); 
			driver.navigate().back();
		}
			
		@Test(priority=2)
		public void negativeTest2() throws InterruptedException
		{
			UserPage up=new UserPage(driver);
			up.createUser("Neethu", "P S", "Neethumol", "neethu@yopmail.com", "option 1", "Administrator");
			up.duplicateAlert1();
			logger.info("Negative test2 passed");
			driver.navigate().back();
		}
			
		@Test(priority=3)
		public void negativeTest3() throws InterruptedException
		{
			UserPage up=new UserPage(driver);
			up.createUser("Neethu", "P S", "NeethumolPS", "neethumolp@datamatica.uk", "option 1", "Administrator");
			up.duplicateAlert2();
			logger.info("Negative test2 passed");
		}
		
		
}
