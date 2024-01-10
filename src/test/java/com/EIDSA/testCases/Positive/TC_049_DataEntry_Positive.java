package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.DataEntry;

import Base.BaseClassTest;

public class TC_049_DataEntry_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void VisitNumberSearchValidation() throws IOException, InterruptedException
	{
		DataEntry de = new DataEntry(driver);
		de.clickDataEntry();
		de.searchVisitNumber("Trial");
		de.clickSearch();
		Assert.assertTrue(de.visitNumberStatusValidation("Trial"));
		logger.info("Visit number search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void VisitNameSearchValidation() throws IOException, InterruptedException
	{
		DataEntry de = new DataEntry(driver);
		de.clickDataEntry();
		de.searchVisitName("Visit 2");
		de.clickSearch();
		Assert.assertTrue(de.visitNameStatusValidation("Visit 2"));
		logger.info("Visit name search verification successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void SaveForm() throws IOException, InterruptedException
	{
		DataEntry de = new DataEntry(driver);
		de.clickDataEntry();
		de.fillform("Trial");
		de.FillFormSave("100", "101", "27-04-2023", "NA");
		de.Alert1();
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void ReviewAndSubmitForm() throws IOException, InterruptedException
	{
		DataEntry de = new DataEntry(driver);
		de.clickDataEntry();
		de.fillform("Trial");
		de.FillFormReviewAndSubmit("100", "101", "27-04-2023", "NA");
		de.Alert2();
		driver.navigate().refresh();
	}


}
