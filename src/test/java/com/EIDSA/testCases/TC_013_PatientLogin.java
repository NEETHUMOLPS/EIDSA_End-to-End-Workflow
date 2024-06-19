package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.PatientLogin;

import Base.BaseClassTest;

public class TC_013_PatientLogin extends BaseClassTest {
	

	@Test(priority=1)
	public void AddLogin() throws IOException, InterruptedException
	{
		PatientLogin pl = new PatientLogin(driver);
		pl.selectStudy("IDS04");
		pl.clickPatientLogin();
		pl.SearchSiteCode("S01");
		pl.findSubId("P03");
		pl.AddLogin("demo01@yopmail.com");
		Assert.assertEquals(pl.Alert(),"Patient login created successfully");
		logger.info("Login added successfully");
	}

}
