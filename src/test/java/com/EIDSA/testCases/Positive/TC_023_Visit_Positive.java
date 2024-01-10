package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Visit;

import Base.BaseClassTest;

public class TC_023_Visit_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void VisitNumSearchFunctionality() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.selectStudy("Study - 001");
		vp.clickVisit();
		vp.SearchVisitNo("002");
		Assert.assertTrue(vp.visitNoSearchValidation("002"));
		logger.info("Visit number search validation successfully completed");	
	}
	
	@Test(priority=2)
	public void VisitNameSearchFunctionality() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.SearchVisitName("Visit - 002");
		Assert.assertTrue(vp.visitNameSearchValidation("Visit - 002"));
		logger.info("Visit name search validation successfully completed");	
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void AssignTemplate() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.SearchVisitName("Visit - 002");
		vp.assignTemp("Visit - 002");
		vp.TemplateAssigning("Medical Fitness-en-4.0");
		vp.assign();
		vp.AssignAlert2();
		logger.info("Template assigned successfully");	
	}
	
	@Test(priority=4)
	public void translate() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		Thread.sleep(2000);	
		vp.view("Visit - 002");
		vp.language("English","Arabic");
		vp.Translate();
		vp.TransalteAlert();
		logger.info("Language traslation successfully completed");		
	}
	

}
