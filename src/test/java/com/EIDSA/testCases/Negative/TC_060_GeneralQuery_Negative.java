package com.EIDSA.testCases.Negative;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.GeneralQuery;

import Base.BaseClassTest;

public class TC_060_GeneralQuery_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void Negative1() throws IOException, InterruptedException
	{
		GeneralQuery gq = new GeneralQuery(driver);
		gq.clickGeneralQueries();
		gq.clickSubmit();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(gq.QErr1(), "Please enter query subject");
		softAssert.assertEquals(gq.QErr2(), "Please enter query message");
		softAssert.assertEquals(gq.QErr3(), "Please select role");
		softAssert.assertEquals(gq.QErr4(), "Please select a recipient");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}

}
