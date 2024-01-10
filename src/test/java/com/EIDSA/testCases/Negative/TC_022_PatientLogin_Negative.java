package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.PatientLogin;

import Base.BaseClassTest;

public class TC_022_PatientLogin_Negative extends BaseClassTest{
	
	@Test(priority=1)
	public void PatientLogin_Negative() throws IOException, InterruptedException
	{
		PatientLogin pl = new PatientLogin(driver);
		pl.selectStudy("Study - 001");
		pl.clickPatientLogin();
		pl.SearchSiteCode("Demo01");
		pl.findSubId("demo04");
		Thread.sleep(2000);
		pl.Submit();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(pl.error1(), "Please enter email");
		softAssert.assertAll();
        logger.info("Negative test1 passed");	
		Thread.sleep(2000);
		
		pl.exsEmail("neethu@yopmail.com");
		pl.Submit();
		Thread.sleep(2000);
		SoftAssert softAssert1 = new SoftAssert();
		softAssert1.assertEquals(pl.error2(), "Email already exist");
		softAssert1.assertAll();
        logger.info("Negative test2 passed");
        
        pl.exsEmail("++");
        pl.Submit();
		Thread.sleep(2000);
		SoftAssert softAssert2 = new SoftAssert();
		softAssert2.assertEquals(pl.error3(), "Invalid email");
		softAssert2.assertAll();
        logger.info("Negative test3 passed");
		
	}

}
