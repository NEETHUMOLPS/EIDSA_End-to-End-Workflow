package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.LoginPage;
import com.EIDSA.pageObjects.Profile;

import Base.BaseClass;

public class TC_003_Profiles_Positive extends BaseClass{
	
	@Test(priority=1)
	public void myProfile() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login("Neethur","neethur@yopmail.com","Neethu@3");
		Profile pp = new Profile(driver);
		pp.selectProfile();
		pp.myProfile("9947466009");
		pp.Alert1();
	}
	
	@Test(priority=2)
	public void changePassword() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.changePassword("Neethu@3", "Neethu@4", "Neethu@4");
		pp.Alert2();
	}
	
	
	@Test(priority=3)
	public void digitalSignatureCreation() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.digitalSignatureCreation("Neethu@2", "Neethu@2");
		pp.Alert4();
	}
	
	@Test(priority=4)
	public void digitalSignatureUpdation() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.digitalSignatureUpdation("Neethu@3", "Neethu@4", "Neethu@4");
		pp.Alert3();		
	}
	
	@Test(priority=5)
	public void defaultSetup() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.defaultSetup("Study - 001", "English", "DD-MM-YYYY", "12 hrs");		
	}

}
