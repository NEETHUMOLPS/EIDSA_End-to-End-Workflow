package com.EIDSA.testCases.Negative;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.EIDSA.pageObjects.Roles;
import Base.BaseClassTest;

public class TC_006_roles_Negative extends BaseClassTest{
	
	//without filling mandatory and optional field
			@Test(priority=1)
			public void negativeTest1() throws InterruptedException
			{
				Roles rp=new Roles(driver);
				rp.clickRoles();
				rp.clickCreateRole();
				rp.clickSubmit();
				SoftAssert softAssert = new SoftAssert();
				softAssert.assertEquals(rp.errMsg(), "Please enter role name");
				softAssert.assertAll();
				logger.info("Negative test1 passed");
				driver.navigate().refresh();
			}
			
			@Test(priority=2)
			public void negativeTest2() throws InterruptedException
			{
				Roles rp=new Roles(driver);
				rp.clickRoles();
				rp.createRoles("Investigator", "NA");
				rp.Alert5();
				logger.info("Negative test2 passed");	
				Thread.sleep(5000);
			}

}


