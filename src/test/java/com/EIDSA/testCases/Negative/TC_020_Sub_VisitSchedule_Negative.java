package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.SubVisitScheduleList;
import com.EIDSA.pageObjects.SubjectPage;

import Base.BaseClassTest;

public class TC_020_Sub_VisitSchedule_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void VisitSchedule() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.selectStudy("Study - 001");
		sp.clickSubject();
		sp.searchSubID("007");
		sp.findSubId("007");
		sp.clickUnscheduleVisit();
		sp.unScheduleVisit_negative();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(sp.errorVisitNum(), "Please enter visit no");
		softAssert.assertEquals(sp.errorVisitName(), "Please enter visit/form name");
		softAssert.assertEquals(sp.errorVisitType(), "Please select a visit type");
		softAssert.assertEquals(sp.errorPreVisit(), "Please enter a number");
		softAssert.assertEquals(sp.errorPostVisit(), "Please enter a number");
		softAssert.assertEquals(sp.errorInvestigator(), "Please enter a investigatorr");
		softAssert.assertEquals(sp.errorVisitDate(), "Please enter visit date");
		softAssert.assertEquals(sp.errorVisitTemplate(), "Please select a visit template");
		softAssert.assertAll();
        logger.info("Negative test1 passed");	
        driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void unsheduledVisitCreation() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.createUnScheduleVisit("003", "Visit - 003","Home Visit", "0", "0", "Neethu P S","16-05-2023","Medical Fitness-en-4.0");
		sp.duplicateAlert();
		logger.info("Negative test2 passed");
	}

}
