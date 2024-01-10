package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.DataEntry;

import Base.BaseClassTest;

public class TC_050_DataEntry_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void negative1() throws IOException, InterruptedException
	{
		DataEntry de = new DataEntry(driver);
		de.clickDataEntry();
		de.fillform("Trial");
		de.clickSiteCode1();
		de.clickPatientScreeningNum1();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		de.clickdate1();
		de.clickintials1();
		de.clickSave();
		Thread.sleep(3000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(de.errorMsg1(), "Please enter a value");
		softAssert.assertEquals(de.errorMsg2(), "Please enter a value");
		softAssert.assertEquals(de.errorMsg3(), "Please enter a value");
		softAssert.assertEquals(de.errorMsg4(), "Please enter a value");
		softAssert.assertAll();
        logger.info("Negative test1 passed");
	}
	
	@Test(priority=2)
	public void negative2() throws IOException, InterruptedException
	{
		DataEntry de = new DataEntry(driver);
		de.clickDataEntry();
		de.fillform("Trial");
		de.clickSiteCode("j");
		de.clickPatientScreeningNum("j");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		de.clickintials("j");
		de.clickSave();
		Thread.sleep(3000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(de.errorMsg5(), "Please enter a value between 100 and 999");
		softAssert.assertEquals(de.errorMsg6(), "Number of characters should be between 3 and 7");
		softAssert.assertEquals(de.errorMsg7(), "Number of characters should be between 2 and 4");
		softAssert.assertAll();
        logger.info("Negative test2 passed");
	}

}
