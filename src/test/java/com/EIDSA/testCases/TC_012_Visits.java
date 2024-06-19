package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Visit;

import Base.BaseClassTest;

public class TC_012_Visits extends BaseClassTest {
	
	@Test(priority=1)
	public void AssignTemplate() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.selectStudy("IDS04");
		vp.clickVisit();
		vp.SearchVisitName("V01");
		vp.assignTemp("V01");
		vp.TemplateAssigning("Patient Information ( 1.0)");
		vp.assign();
		Assert.assertEquals(vp.Alert(),"Template assigned successfully");	
	}
	
/*	@Test(priority=2)
	public void translate() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.view("V01");
		vp.language("English","Arabic");
		vp.Translate();
		Assert.assertEquals(vp.Alert(),"Are you sure, you want to convert this form to Arabic");	
		logger.info("Language traslation successfully completed");	
		driver.navigate().back();
		vp.SearchVisitName("V01");
		vp.assignTemp("V01");
		vp.TemplateAssigning("Patient Information ( 1.0)");
		vp.assign();
		Assert.assertEquals(vp.Alert(),"Template assigned successfully");	
		logger.info("Template assigned successfully");	

		
	}*/
	

}
