package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.Screen;

import Base.BaseClassTest;

public class TC_Screens_Positive extends BaseClassTest{
	
	@Test(priority=1)
	public void addScreen() throws IOException, InterruptedException, Exception
	{
		Screen sp = new Screen(driver);
		sp.clickScreens();
		sp.addScreens("Documents");
	}
	
	@Test(priority=2)
	public void editScreen() throws IOException, InterruptedException, Exception
	{
		Screen sp = new Screen(driver);
		sp.selScreen("Documents");
		sp.EditScreen("My Files");
		sp.screenUpdationAlert();
	}
	
	@Test(priority=3)
	public void addControl() throws IOException, InterruptedException, Exception
	{
		Screen sp = new Screen(driver);
		sp.addControl("Edit");
	}
	
	@Test(priority=4)
	public void editControl() throws IOException, InterruptedException, Exception
	{
		Screen sp = new Screen(driver);
		sp.editControl("Add");
	}
	
	@Test(priority=5)
	public void deleteControl() throws IOException, InterruptedException, Exception
	{
		Screen sp = new Screen(driver);
		sp.deleteControl();
		sp.controlDeletionAlert();
	}
	
	@Test(priority=6)
	public void deleteScreen() throws IOException, InterruptedException, Exception
	{
		Screen sp = new Screen(driver);
		sp.deleteScreen();
		sp.screenDeletionAlert();
	}

}
