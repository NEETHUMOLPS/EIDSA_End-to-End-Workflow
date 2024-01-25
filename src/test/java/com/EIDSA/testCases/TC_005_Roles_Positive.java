package com.EIDSA.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.Roles;
import com.EIDSA.utilities.XLUtility;
import Base.BaseClassTest;

public class TC_005_Roles_Positive extends BaseClassTest {
	
	@Test(dataProvider="DD1",priority=1, description = "Create new role")
	public void roleCreation(String name,String des) throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.clickRoles();
		rp.createRoles(name,des);
		rp.Alert1();
		logger.info("Role added successfully");	
	}
	
	
	@Test(priority=2, description = "Edit the role details")
	public void roleEdit() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.searchRoles("Automation Tester");
		rp.edit("Automation Tester");
		rp.editData("NA");
		rp.Alert2();
		logger.info("Role updated");			
	 }
	@Test(priority=3, description = "Delete the role")
	public void roleDelete() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.searchRoles("Automation Tester");
		rp.delete("Automation Tester");
		rp.Alert4();
		logger.info("Role deleted successfully");	
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\EIDSA\\Roles.xlsx";
int rownum=XLUtility.getRowCount(path, "Sheet1");
	int colcount=XLUtility.getCellCount(path, "Sheet1", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "Sheet1", i, j);
		}
	}
	
	return data;	

	}
	
	
}
