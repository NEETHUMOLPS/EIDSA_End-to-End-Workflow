package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FieldPrivilege;

import Base.BaseClassTest;

public class TC_029_FieldPrivilege_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void negative1() throws IOException, InterruptedException
	{
		FieldPrivilege fp = new FieldPrivilege(driver);
		fp.clickFieldPrivilege();
		fp.selectStudy("STUDY 01");
		fp.clickSetPrivilege("Informed Consent");
		fp.negative1();
		fp.Alert2();
		logger.info("Negative test passed");
		driver.navigate().back();
	}
	
	@Test(priority=2)
	public void negative2() throws IOException, InterruptedException
	{
		FieldPrivilege fp = new FieldPrivilege(driver);
		fp.selectStudy("STUDY 01");
		fp.clickSetPrivilege("Informed Consent");
		fp.negative("Auto tester");
		fp.Alert1();
		logger.info("Negative test passed");
	}

}
