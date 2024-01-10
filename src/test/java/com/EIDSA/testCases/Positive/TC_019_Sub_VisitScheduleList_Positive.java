package com.EIDSA.testCases.Positive;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SubVisitScheduleList;
import com.EIDSA.pageObjects.SubjectPage;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_019_Sub_VisitScheduleList_Positive extends BaseClassTest{
	
	@Test(priority=1)
	public void unsheduledVisitCreation() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.selectStudy("Study - 001");
		sp.clickSubject();
		sp.searchSubID("007");
		sp.findSubId("007");
		sp.createUnScheduleVisit("005", "Visit - 005", "Home Visit", "0", "0", "Neethu P S","30-11-2023","Repeated Measures-en-1");
		sp.creationAlert();
		logger.info("Unsheduled visit created successfully");
	}

	@Test(priority=2)
	public void visitNameSearchValidation() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.SearchVisitName("Visit - 002");
		Assert.assertTrue(sp.visitNameSearchValidation("Visit - 002"));
		logger.info("Visit name search validation successfully completed");
	}
	
		@Test(priority=3)
		public void visitScheduleSearchValidation() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.SearchVisitSchedule("Overdue");
		Assert.assertTrue(sp.visitScheduleSearchValidation("Overdue"));
		logger.info("Visit schedule search validation successfully completed");		
	}
	
	@Test(priority=4)
	public void dateSearchValidation() throws IOException, InterruptedException, ParseException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.SearchVisitDate("30-11-2023", "30-11-2023");
		Assert.assertTrue(sp.dateSearchValidation("30/11/2023"));
		logger.info("Date search validated ");	
	}
	
	@Test(priority=5)
	public void withdraw() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.withdraw("Visit - 002");
		sp.withdrawAlert();
		logger.info("Visit withdrew successfully");
		driver.navigate().refresh();
	}
	
	
	@Test(priority=6)
	public void view() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.clickSubject();
		sp.searchSubID("002");
		sp.findSubId("002");
		sp.SearchVisitName("002");
		sp.view("002");
		logger.info("Opened successfully");
	}
	
	
	
	

}
