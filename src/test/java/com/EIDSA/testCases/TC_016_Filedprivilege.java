package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FieldPrivilege;

import Base.BaseClassTest;

public class TC_016_Filedprivilege extends BaseClassTest {
	
	@Test(priority=1)
	public void setFieldPrivilege() throws IOException, InterruptedException
	{
		FieldPrivilege fp = new FieldPrivilege(driver);
		fp.clickFieldPrivilege();
		fp.selectStudy("IDS04");
		fp.clickSetPrivilege("Patient Information");
		fp.setPrivilege("Administrator");
		Assert.assertEquals(fp.Alert(),"Privilege added successfully");
		logger.info("Privilege added successfully");
	}
}
