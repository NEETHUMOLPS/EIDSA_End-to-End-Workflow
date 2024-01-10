package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Users;

import Base.BaseClassTest;

public class TC_039_Users_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void EmailSearch() throws IOException, InterruptedException
	{
		Users us = new Users(driver);
		us.clickUsers();
		Thread.sleep(4000);
		us.SearchEmailOrName("neethumolp@datamatica.uk");
		us.clickSearch();
		Thread.sleep(4000);
		Assert.assertTrue(us.EmailSearchValidation("neethumolp@datamatica.uk"));
		logger.info("Email search functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void RoleSearch() throws IOException, InterruptedException
	{
		Users us = new Users(driver);
		us.clickUsers();
		Thread.sleep(4000);
		us.SearchRole("Administrator");
		us.clickSearch();
		Thread.sleep(4000);
		Assert.assertTrue(us.RolesearchValidation("Administrator"));
		logger.info("Role search functionality verified");
	}

}
