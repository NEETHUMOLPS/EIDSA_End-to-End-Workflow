package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SubmitForm;

import Base.BaseClassTest;

public class TC_031_SubmitForm_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void SaveForm() throws IOException, InterruptedException
	{
		SubmitForm fp = new SubmitForm(driver);
		fp.clickSubmitForm();
		fp.selectSubmitForm("visit 06");
		fp.fillFormSave();
		fp.Alert1();
		logger.info("Form saved successfully");		
		Thread.sleep(4000);
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void ReviewandSubmitForm() throws IOException, InterruptedException
	{
		SubmitForm fp = new SubmitForm(driver);
		fp.clickSubmitForm();
		fp.selectSubmitForm("visit 03");
		fp.fillFormReviewAndSubmit();
		fp.Alert2();
		logger.info("Form submitted successfully");	
		Thread.sleep(4000);
		driver.navigate().refresh();
	}


}
