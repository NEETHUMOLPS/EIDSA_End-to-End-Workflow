package com.EIDSA.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.Roles;
import com.EIDSA.utilities.XLUtility;
import Base.BaseClassTest;

public class TC_005_Roles_Positive extends BaseClassTest {
	
	@Test(priority=1, description = "Create new role")
	public void roleCreation() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.clickRoles();
		rp.createRoles("Automation Tester01","");
		rp.Alert1();
		logger.info("Role added successfully");	
	}
	
	
	@Test(priority=2, description = "Edit the role details")
	public void roleEdit() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.searchRoles("Automation Tester01");
		rp.edit("Automation Tester01");
		rp.editData("Testing");
		rp.Alert2();
		logger.info("Role updated");			
	 }
	@Test(priority=3, description = "Delete the role")
	public void roleDelete() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.searchRoles("Automation Tester01");
		rp.delete("Automation Tester01");
		rp.Alert4();
		logger.info("Role deleted successfully");	
	}
	
	
}
