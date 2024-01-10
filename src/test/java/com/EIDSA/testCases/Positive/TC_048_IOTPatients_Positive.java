package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.IOT;

import Base.BaseClassTest;

public class TC_048_IOTPatients_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void SubjectIdSearchValidation() throws IOException, InterruptedException
	{
		IOT ms = new IOT(driver);
		ms.clickIOTPatients();
		Thread.sleep(3000);
		ms.searchStudyId("10001-11");
		Thread.sleep(3000);
		ms.clickSearch();
		Thread.sleep(3000);
		Assert.assertTrue(ms.studyStatusValidation("10001-11"));
		logger.info("Subject id search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void DeviceNameSearchValidation() throws IOException, InterruptedException
	{
		IOT ms = new IOT(driver);
		ms.clickIOTPatients();
		Thread.sleep(3000);
		ms.searchDeviceName("MI Watch");
		Thread.sleep(3000);
		ms.clickSearch();
		Thread.sleep(3000);
		Assert.assertTrue(ms.deviceNameStatusValidation("MI Watch"));
		logger.info("Device name search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void FormNameSearchValidation() throws IOException, InterruptedException
	{		
		IOT ms = new IOT(driver);
		ms.clickIOTPatients();
		Thread.sleep(3000);
		ms.searchFormName("Month1");
		Thread.sleep(3000);
		ms.clickSearch();
		Thread.sleep(3000);
		Assert.assertTrue(ms.formNameStatusValidation("Month1"));
		logger.info("Device name search verification successfully completed");
		Thread.sleep(3000);	
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void view() throws IOException, InterruptedException
	{
		IOT ms = new IOT(driver);
		ms.clickIOTPatients();
		Thread.sleep(3000);
		ms.view("10001-11");
		logger.info("Form opened");
	}
}
