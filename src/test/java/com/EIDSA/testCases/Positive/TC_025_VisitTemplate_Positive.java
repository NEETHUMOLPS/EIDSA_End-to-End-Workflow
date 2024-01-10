package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.VisitTemplate;

import Base.BaseClassTest;

public class TC_025_VisitTemplate_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void siteCodeSearchFunctionality() throws IOException, InterruptedException
	{
		VisitTemplate vp = new VisitTemplate(driver);
		vp.selectStudy("Study - 001");
		vp.clickVisitTemplate();
		vp.SiteCode("002");
		vp.SubId("007");
		Assert.assertTrue(vp.siteCodeSearchValidation("002"));
		Assert.assertTrue(vp.subjectIdSearchValidation("007"));
		logger.info("Site code and subject id - search validation successfully verified");	
	}
	
	@Test(priority=2)
	public void VisitNameSearchFunctionality() throws IOException, InterruptedException
	{
		VisitTemplate vp = new VisitTemplate(driver);
		vp.SearchVisitName("001");		
		Assert.assertTrue(vp.visitNameSearchValidation("001"));
		logger.info("Visit name search validation successfully completed");		
	}
	
	@Test(priority=3)
	public void VisitNoSearchFunctionality() throws IOException, InterruptedException
	{
		VisitTemplate vp = new VisitTemplate(driver);
		vp.SearchVisitNo("001");
		Assert.assertTrue(vp.visitNumSearchValidation("001"));
		logger.info("Visit number search validation successfully completed");			
	}
	
	@Test(priority=4)
	public void templateEdit() throws IOException, InterruptedException
	{
		VisitTemplate vp = new VisitTemplate(driver);
		vp.edit("001");
		vp.Template("Medical Fitness-en-4.0");
		vp.AssignAlert1();
		logger.info("Template assigned successfully");
	}
	
}
