package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SubjectSchedule;

import Base.BaseClassTest;

public class TC_038_SubjectSchedule_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void negative1() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.ClickSearch();
		fs.Alert1();
		logger.info("Negative test1 passed");
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void negative2() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.searchSiteCode("Demo01");
		fs.ClickSearch();
		fs.Alert2();
		logger.info("Negative test2 passed");
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void negative3() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.searchSiteCode("Demo01");
		fs.searchSubId("demo02");
		Thread.sleep(3000);
		//fs.ClickSearch();
		fs.Alert3();
		logger.info("Negative test3 passed");
		driver.navigate().refresh();
	}
		

}
