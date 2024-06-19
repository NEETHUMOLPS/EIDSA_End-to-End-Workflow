package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.ChangeUnscheduledTemplate;

import Base.BaseClassTest;

public class TC_014_UnscheduledTemplate extends BaseClassTest {
	

	@Test(priority=1)
	public void changeTemplate() throws IOException, InterruptedException
	{
		ChangeUnscheduledTemplate ct = new ChangeUnscheduledTemplate(driver);
		ct.selectStudy("IDS04");
		ct.clickChangeUnscheduledTemplate();
		ct.SearchSitecode("S01");
		ct.SearchSubjectId("P01");
		ct.editTemplate("Patient Information (1.1)");
		Assert.assertEquals(ct.Alert(),"Template assigned successfully");
	}


}
