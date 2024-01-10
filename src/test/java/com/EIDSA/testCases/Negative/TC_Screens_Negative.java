package com.EIDSA.testCases.Negative;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Screen;

import Base.BaseClassTest;

public class TC_Screens_Negative extends BaseClassTest{
	
	//without filling mandatory and optional field
		@Test(priority=1)
		public void negativeTest1() throws InterruptedException
		{
			Screen sp=new Screen(driver);
			sp.clickScreens();
			sp.negative1();
			logger.info("Negative test1 passed"); 
		}
		
		@Test(priority=2)
		public void negativeTest2() throws InterruptedException
		{
			Screen sp=new Screen(driver);
			sp.selScreen("screen demo");
			sp.negative2();
			logger.info("Negative test2 passed"); 
		}
		
		@Test(priority=3)
		public void negativeTest3() throws InterruptedException
		{
			Screen sp=new Screen(driver);
			sp.addScreens("screen demo");
			sp.duplicateAlert1();
			logger.info("Negative test3 passed"); 
		}
		
		@Test(priority=4)
		public void negativeTest4() throws InterruptedException
		{
			Screen sp=new Screen(driver);
			sp.selScreen("screen demo");
			sp.addControl("View");
			logger.info("Negative test4 passed"); 
			sp.duplicateAlert2();
		}

}
