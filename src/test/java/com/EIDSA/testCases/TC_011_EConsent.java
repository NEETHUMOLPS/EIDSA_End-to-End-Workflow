package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyProfile;
import com.EIDSA.pageObjects.EConsent;

import Base.BaseClassTest;

public class TC_011_EConsent extends BaseClassTest{
	
	@Test(priority=1, description = "Site code search validation")
	public void ivite() throws IOException, InterruptedException
	{
		EConsent ec = new EConsent(driver);
		ec.selectStudy("IDS04");
		ec.clickOnEConsent();
		ec.SearchSubId("P04");
		ec.invite("neethu@yopmail.com");
		Assert.assertEquals(ec.Alert(),"Patient login created successfully");
	}

}
