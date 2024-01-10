package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SitePrivilege;

import Base.BaseClassTest;

public class TC_027_SitePrivilege_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void SitePrivilege() throws IOException, InterruptedException
	{
		SitePrivilege sp = new SitePrivilege(driver);
		sp.clickSitePrivilege();
		sp.sitePrivilegeSetting("Neethu P S");
		sp.Alert1();
		logger.info("User site privilege updated successfully");		
	}

}
