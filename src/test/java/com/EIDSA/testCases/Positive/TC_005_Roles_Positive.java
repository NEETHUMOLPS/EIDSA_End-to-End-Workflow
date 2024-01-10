package com.EIDSA.testCases.Positive;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.Roles;
import com.EIDSA.utilities.XLUtility;
import Base.BaseClassTest;

public class TC_005_Roles_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void roleCreation() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.clickRoles();
		rp.createRoles("Automation Tester", "Testing");
		rp.Alert1();
		logger.info("Role added successfully");	
	}
	
	@Test(priority=2)
	public void roleNameSearch() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.searchRoles("Automation Tester");
		Assert.assertTrue(rp.roleNameSearchValidation("Automation Tester"));
		logger.info("Role name search functionality verified");	
	}
	
	@Test(priority=3)
	public void roleEdit() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.edit("Automation Tester");
		rp.editData("NA");
		rp.Alert2();
		logger.info("Role updated");			
	 }
	@Test(priority=4)
	public void roleDelete() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.searchRoles("Automation Tester");
		rp.delete("Automation Tester");
		rp.Alert4();
		logger.info("Role deleted successfully");	
	}
}
