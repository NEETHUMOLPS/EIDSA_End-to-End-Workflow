package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.PatientLogin;

import Base.BaseClassTest;

public class TC_021_PatientLogin_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void SiteCodeSearchFunctionality() throws IOException, InterruptedException
	{
		PatientLogin pl = new PatientLogin(driver);
		pl.selectStudy("Study - 001");
		pl.clickPatientLogin();
		pl.SearchSiteCode("002");
		Assert.assertTrue(pl.siteCodeSearchValidation("002"));
		logger.info("Site code search validation successfully completed");	
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void SubjectIdSearchValidation() throws IOException, InterruptedException
	{
		PatientLogin pl = new PatientLogin(driver);
		pl.SearchSubId("002");
		Assert.assertTrue(pl.SubjectIdSearchValidation("002"));
		logger.info("Subject Id search validation successfully completed");		
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void StatusSearchValidation() throws IOException, InterruptedException
	{
		PatientLogin pl = new PatientLogin(driver);
		pl.SearchStatus("Pending");
		Assert.assertTrue(pl.StatusSearchValidation("Pending"));
		logger.info("Status search validation successfully completed");		
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void AddLogin() throws IOException, InterruptedException
	{
		PatientLogin pl = new PatientLogin(driver);
		pl.clickPatientLogin();
		pl.SearchSiteCode("002");
		pl.findSubId("003");
		pl.AddLogin("demo04new@yopmail.com");
		pl.CreationAlert();
		logger.info("Login added successfully");
	}

}
