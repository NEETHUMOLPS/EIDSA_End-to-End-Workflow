package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.FormSummary;

import Base.BaseClassTest;

public class TC_055_FormSummary_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void negative1_documentUpload() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("visit07");
		fs.uploadDocuments();
		fs.documenterr1();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(fs.documenterr1(), "Please select a file");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}
	
	@Test(priority=2)
	public void negative_FormQuery() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("visit07");
		fs.formQuery_Negative();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(fs.QErr1(), "Please enter query subject");
		softAssert.assertEquals(fs.QErr2(), "Please enter query message");
		softAssert.assertEquals(fs.QErr3(), "Please select role");
		softAssert.assertEquals(fs.QErr4(), "Please select recipient");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}
	
	@Test(priority=3)
	public void negative_PageQuery() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("visit07");
		fs.pageQuery_Negative();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(fs.QErr5(), "Please enter query subject");
		softAssert.assertEquals(fs.QErr6(), "Please enter query message");
		softAssert.assertEquals(fs.QErr7(), "Please select role");
		softAssert.assertEquals(fs.QErr8(), "Please select recipient");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}
	
	@Test(priority=4)
	public void negative_Sign1() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("visit 06");
		fs.sign_Negative1();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(fs.pageerr1(), "Please enter a valid email id");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}
	
	@Test(priority=5)
	public void negative_Sign2() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("visit 06");
		fs.sign_Negative2();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(fs.pageerr2(), "Please enter your password");
		softAssert.assertAll();
        logger.info("Negative test passed");
        driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void negative_ReplyQuery() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("visit 06");
		fs.OpenQueryReply_Negative();
		fs.Alert10();
        logger.info("Negative test passed");
	}

}
