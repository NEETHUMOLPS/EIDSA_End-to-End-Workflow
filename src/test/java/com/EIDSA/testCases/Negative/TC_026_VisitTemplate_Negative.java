package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.VisitTemplate;

import Base.BaseClassTest;

public class TC_026_VisitTemplate_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void templateEdit() throws IOException, InterruptedException
	{
		VisitTemplate vp = new VisitTemplate(driver);
		vp.selectStudy("Study - 001");
		vp.clickVisitTemplate();
		vp.SiteCode("002");
		vp.SubId("007");
		vp.SearchVisitNo("004");
		vp.SearchVisitName("Visit - 004");
		vp.edit("Visit - 004");
		vp.clickAssign();
		vp.AssignAlert2();
		logger.info("Negative test passed");
	}

}
