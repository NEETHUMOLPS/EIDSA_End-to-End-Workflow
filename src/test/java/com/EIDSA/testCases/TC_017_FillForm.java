package com.EIDSA.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FillForm;
import Base.BaseClassTest;

public class TC_017_FillForm extends BaseClassTest {
	
	@Test(priority=1, description = "Save the form")
	public void SaveForm() throws IOException, InterruptedException
	{
		FillForm fp = new FillForm(driver);
		fp.selectStudy1("IDS04");
		fp.clickFillForm();
		fp.selectForm1();
		fp.fillFormSave("Neethu");
		Assert.assertEquals(fp.Alert(),"Form saved successfully");
		logger.info("Form saved successfully");		
	}
		
	@Test(priority=2, description = "Submit the form")
	public void ReviewandSubmitForm() throws IOException, InterruptedException
	{
		FillForm fp = new FillForm(driver);
		fp.selectForm2();
		fp.fillFormReviewAndSubmit("Neethu");
		Assert.assertEquals(fp.Alert(),"Form submitted successfully");
		logger.info("Form submitted successfully");	
	}
	
	@Test(priority=3, description = "Fill the form through data entry")
	public void DataEntry() throws IOException, InterruptedException
	{
		FillForm fp = new FillForm(driver);
		fp.dataEntry("Neethu");
		Assert.assertEquals(fp.Alert(),"Form submitted successfully");
		logger.info("Form submitted successfully");	
	}
	

}
