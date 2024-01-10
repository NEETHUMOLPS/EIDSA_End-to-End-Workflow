package com.EIDSA.testCases.Positive;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.UserPage;
import com.EIDSA.utilities.XLUtility;


import Base.BaseClassTest;

public class TC_009_Users_Positive extends BaseClassTest{
	
	@Test(priority=1)
	public void userCreation() throws IOException, InterruptedException
	{		
		UserPage up=new UserPage(driver);
		up.clickUser();
		up.createUser("Neethu", "Gokul", "Neethug", "neethug@yopmail.com", "option 1", "Administrator");
		up.userCreationAlert();
	}	
	@Test(priority=2)
	public void EmailOrNameSearch() throws IOException, InterruptedException
	{		
		UserPage up=new UserPage(driver);
		up.searchEmailOrName("neethug@yopmail.com");
		Assert.assertTrue(up.emailSearchValidation("neethug@yopmail.com"));
		logger.info("Email search functionality verified");	
		/*up.clearEmailOrName();
		up.searchEmailOrName("Neethu Gokul");
		Assert.assertTrue(up.nameSearchValidation("Neethu Gokul"));
		logger.info("Name search functionality verified");	*/
	}
	
	@Test(priority=3)
	public void RoleSearch() throws IOException, InterruptedException
	{		
		UserPage up=new UserPage(driver);
		up.searchRole("Administrator");
		Assert.assertTrue(up.RoleValidation("Administrator"));
		logger.info("Role search functionality verified");	
	}
	
	@Test(priority=4)
	public void userEdit() throws InterruptedException
	{
		UserPage up=new UserPage(driver);
		up.edit1("neethug@yopmail.com");
	    up.edit2("9988776655");
	    up.userUpdationAlert();
	}
	
	@Test(priority=5)
	public void userPrivilege() throws InterruptedException
	{
		UserPage up=new UserPage(driver);
		up.searchEmailOrName("neethug@yopmail.com");
		up.privilege1("neethug@yopmail.com");
		up.privilege2();
	    up.privilegeAlert();
	    logger.info("User privilege updated successfully");
	}
	
	@Test(priority=6)
	public void auditTrail() throws IOException, InterruptedException
	{
		UserPage up=new UserPage(driver);
		up.searchEmailOrName("neethug@yopmail.com");
		up.auditTrail1("neethug@yopmail.com");
		up.auditTrail2();		
	}
	
	@Test(priority=7)
	public void userDelete() throws IOException, InterruptedException
	{
		UserPage up=new UserPage(driver);	
		up.delete("neethug@yopmail.com");	
		up.userDeletionAlert();
	}


}
