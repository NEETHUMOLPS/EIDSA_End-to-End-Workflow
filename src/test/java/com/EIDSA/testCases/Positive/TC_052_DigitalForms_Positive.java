package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.DigitalForms;

import Base.BaseClassTest;

public class TC_052_DigitalForms_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void formNameSearchValidation() throws IOException, InterruptedException
	{
		DigitalForms te = new DigitalForms(driver);
		te.clickDigitalForms();
		te.searchFormName("Screening Visit");
		te.clickSearch();
		Assert.assertTrue(te.verifyformname("Screening Visit"));
		logger.info("Form name search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void statusValidation() throws IOException, InterruptedException
	{
		DigitalForms te = new DigitalForms(driver);
		te.clickDigitalForms();
		te.searchStatus("Assigned");
		te.clickSearch();
		Assert.assertTrue(te.verifyStatus("Assigned"));
		logger.info("Status search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void FormApprove() throws IOException, InterruptedException
	{
		DigitalForms te = new DigitalForms(driver);
		te.clickDigitalForms();
		te.searchFormName("Screening Visit");
		te.clickSearch();
		te.view("Screening Visit");
		te.clickApprove();
		te.Alert1();
		logger.info("Form approved");
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void FormReject() throws IOException, InterruptedException
	{
		DigitalForms te = new DigitalForms(driver);
		te.clickDigitalForms();
		te.searchFormName("Screening Visit");
		te.clickSearch();
		te.view("Screening Visit");
		te.clickReject();
		te.Alert2();
		logger.info("Form rejected");
	}
	
	
}
