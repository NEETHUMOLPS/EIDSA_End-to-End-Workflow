package com.EIDSA.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SitePrivilege;

import Base.BaseClassTest;

public class TC_015_SitePrivilege extends BaseClassTest {
	
	@Test(priority=1)
	public void SitePrivilege() throws IOException, InterruptedException
	{
		SitePrivilege sp = new SitePrivilege(driver);
		sp.clickSitePrivilege();
		sp.sitePrivilegeSetting("Neethumol P S");
		Assert.assertEquals(sp.Alert(),"User site privilege updated successfully");
		logger.info("User site privilege updated successfully");		
	}

}
